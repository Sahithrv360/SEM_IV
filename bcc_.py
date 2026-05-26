from collections import defaultdict

def BCC(graph, V):
    disc = [-1] * V
    low = [-1] * V
    stack = []
    time = [0]

    def dfs(u, parent):
        disc[u] = low[u] = time[0]
        time[0] += 1
        children = 0

        for v in graph[u]:
            if disc[v] == -1:  # unvisited
                stack.append((u, v))
                children += 1
                dfs(v, u)
                low[u] = min(low[u], low[v])

                # Articulation point
                if (parent != -1 and low[v] >= disc[u]) or (parent == -1 and children > 1):
                    bcc = []
                    while stack[-1] != (u, v):
                        bcc.append(stack.pop())
                    bcc.append(stack.pop())
                    print("BCC:", bcc)

            elif v != parent and disc[v] < disc[u]:
                low[u] = min(low[u], disc[v])
                stack.append((u, v))

    for i in range(V):
        if disc[i] == -1:
            dfs(i, -1)
            if stack:
                bcc = []
                while stack:
                    bcc.append(stack.pop())
                print("BCC:", bcc)

# Example usage
V = 5
graph = defaultdict(list)
edges = [(0,1),(1,2),(2,0),(1,3),(3,4)]
for u,v in edges:
    graph[u].append(v)
    graph[v].append(u)

BCC(graph, V)