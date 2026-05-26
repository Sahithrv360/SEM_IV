import heapq

def dijkstra(graph, V, source):
    dist = [float('inf')] * V
    dist[source] = 0
    pq = [(0, source)]  # (distance, vertex)

    while pq:
        d, u = heapq.heappop(pq)
        if d > dist[u]:
            continue
        for v, w in graph[u]:
            if dist[u] + w < dist[v]:
                dist[v] = dist[u] + w
                heapq.heappush(pq, (dist[v], v))
    return dist

# Example usage
V = 4
graph = {
    0: [(1,4), (2,1)],
    1: [(3,1)],
    2: [(1,2), (3,5)],
    3: []
}

print(dijkstra(graph,V,0))