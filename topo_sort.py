def dfs_topo_sort(V, adj):
    visited = [False] * V
    stack = []

    def dfs(u):
        visited[u] = True
        for v in adj[u]:
            if not visited[v]:
                dfs(v)
        stack.append(u)

    for i in range(V):
        if not visited[i]:
            dfs(i)

    stack.reverse()  # reverse to get topo order
    return stack

# Example usage
V = 6
adj = eval(input("Enter in form of dict : "))
# adj = {0: [1,5], 1: [2], 2: [3], 3: [4], 4: [5], 5: [0]}
print(dfs_topo_sort(V, adj))

