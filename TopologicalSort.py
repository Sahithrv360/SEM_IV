from collections import defaultdict, deque

class Graph:
    def __init__(self, vertices):
        self.V = vertices
        self.graph = defaultdict(list)  # adjacency list

    def add_edge(self, u, v):
        """Add a directed edge u → v"""
        self.graph[u].append(v)

    def topological_sort(self):
        """Perform Topological Sort using Kahn's Algorithm (BFS)."""
        # Step 1: Compute in-degree (number of incoming edges) for each vertex
        in_degree = [0] * self.V
        for u in self.graph:
            for v in self.graph[u]:
                in_degree[v] += 1

        # Step 2: Collect all vertices with in-degree 0
        queue = deque([i for i in range(self.V) if in_degree[i] == 0])
        topo_order = []

        # Step 3: Process vertices in queue
        while queue:
            u = queue.popleft()
            topo_order.append(u)

            # For each outgoing edge from u → v
            for v in self.graph[u]:
                in_degree[v] -= 1  # remove edge u → v
                if in_degree[v] == 0:
                    queue.append(v)

        # Step 4: Check if topological sorting is possible
        if len(topo_order) == self.V:
            print("Topological Sorting of the given DAG:")
            print(topo_order)
        else:
            print("The graph contains a cycle — topological sort not possible.")


# Example: Create a graph and perform Topological Sorting
g = Graph(6)
g.add_edge(5, 2)
g.add_edge(5, 0)
g.add_edge(4, 0)
g.add_edge(4, 1)
g.add_edge(2, 3)
g.add_edge(3, 1)

g.topological_sort()
