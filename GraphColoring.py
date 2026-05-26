def print_solution(colors):
    """Print the color assigned to each vertex."""
    global solution_count
    solution_count += 1
    print(f"Solution {solution_count}:")
    for vertex, color in enumerate(colors):
        print(f"Vertex {vertex} --> Color {color}")
    print()


def is_safe(v, graph, colors, c):
    """Check if vertex v can be colored with color c."""
    for i in range(len(graph)):
        if graph[v][i] == 1 and colors[i] == c:
            return False
    return True


def graph_coloring_util(graph, m, colors, v):
    """Recursive function to generate all valid colorings."""
    if v == len(graph):
        print_solution(colors)
        return  # Do NOT return True — continue searching

    for c in range(1, m + 1):
        if is_safe(v, graph, colors, c):
            colors[v] = c
            graph_coloring_util(graph, m, colors, v + 1)
            colors[v] = 0  # Backtrack


def graph_coloring(graph, m):
    """Main function to solve the Graph Coloring problem."""
    global solution_count
    solution_count = 0
    n = len(graph)
    colors = [0] * n
    graph_coloring_util(graph, m, colors, 0)

    if solution_count == 0:
        print("No solutions exist.")


# Example Graph represented using adjacency matrix
# graph = [
#     [0, 1, 1, 1],
#     [1, 0, 1, 0],
#     [1, 1, 0, 1],
#     [1, 0, 1, 0]
# ]
graph = eval(input("Enter input in of list"))

m = 3  # Number of colors

graph_coloring(graph, m)
