from collections import defaultdict

class Graph:
    def __init__(self, V):
        self.V = V
        self.graph = defaultdict(list)
        self.time = 0  # Global timer

    def add_edge(self, u, v):
        self.graph[u].append(v)
        self.graph[v].append(u)

    def _DFS(self, u, parent, visited, disc, low, stack, bcc):
        children = 0
        visited[u] = True
        disc[u] = low[u] = self.time
        self.time += 1

        for v in self.graph[u]:
            if not visited[v]:
                children += 1
                stack.append((u, v))
                self._DFS(v, u, visited, disc, low, stack, bcc)
                low[u] = min(low[u], low[v])

                # If articulation point found
                if (parent == -1 and children > 1) or (parent != -1 and low[v] >= disc[u]):
                    component = []
                    while stack[-1] != (u, v):
                        component.append(stack.pop())
                    component.append(stack.pop())
                    bcc.append(component)
            elif v != parent and disc[v] < low[u]:
                low[u] = disc[v]
                stack.append((u, v))

    def find_BCC(self):
        visited = [False] * self.V
        disc = [0] * self.V
        low = [0] * self.V
        stack = []
        bcc = []

        for i in range(self.V):
            if not visited[i]:
                self._DFS(i, -1, visited, disc, low, stack, bcc)

                # Remaining edges in stack form one BCC
                if stack:
                    component = []
                    while stack:
                        component.append(stack.pop())
                    bcc.append(component)

        return bcc


# Example Usage
if __name__ == "__main__":
    g = Graph(5)
    g.add_edge(0, 1)
    g.add_edge(1, 2)
    g.add_edge(2, 0)
    g.add_edge(1, 3)
    g.add_edge(3, 4)

    bcc = g.find_BCC()
    print("Bi-Connected Components (edges):")
    for i, comp in enumerate(bcc, 1):
        print(f"BCC {i}: {comp}")