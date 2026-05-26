import heapq
from collections import defaultdict
class Graph:
    def __init__(self, vertices):
        self.V = vertices
        # self.graph = {i: [] for i in range(vertices)}
        self.graph = defaultdict(list)  # adjacency list

    def add_edge(self, u, v, w):
        """Add a directed edge u → v with weight w."""  
        self.graph[u].append((v, w))

    def dijkstra(self, src):
        """Compute and print shortest distances (costs) from src."""
        dist = [float("inf")] * self.V
        dist[src] = 0

        pq = [(0, src)]  # (distance, vertex)

        while pq:
            current_dist, u = heapq.heappop(pq)

            # Skip outdated entries
            if current_dist > dist[u]:
                continue

            # Check neighbors
            for v, weight in self.graph[u]:
                distance = current_dist + weight
                if distance < dist[v]:
                    dist[v] = distance
                    heapq.heappush(pq, (distance, v))

        # Print final shortest distances
        print(f"\nShortest distances (costs) from source vertex {src}:")
        for i in range(self.V):
            if dist[i] == float("inf"):
                print(f"Vertex {i}: No path")
            else:
                print(f"Vertex {i}: {dist[i]}")


# Example Graph (6 vertices)
g = Graph(5)
g.add_edge(0, 1, 7)
g.add_edge(0,2,1)
g.add_edge(1,3,3)
g.add_edge(1,2,8)
g.add_edge(2, 3, 2)
g.add_edge(2,4,7)
g.add_edge(3,4,6)

# Run Dijkstra from vertex 5
src = 0

g.dijkstra(src)
