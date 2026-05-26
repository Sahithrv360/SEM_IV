def print_solution(board):
    """Print the chessboard solution."""
    global sol_c
    sol_c += 1
    print(f'Solution Count : {sol_c}')
    for row in board:
        # print(" ".join(row))
        print(" ".join(row))
    print()


def is_safe(board, row, col, n):
    """Check if a queen can be placed at board[row][col]."""
    # Check this column on upper side
    for i in range(row):
        if board[i][col] == 'Q':
            return False

    # Check upper-left diagonal
    i, j = row, col
    while i >= 0 and j >= 0:
        if board[i][j] == 'Q':
            return False
        i -= 1
        j -= 1

    # Check upper-right diagonal
    i, j = row, col
    while i >= 0 and j < n:
        if board[i][j] == 'Q':
            return False
        i -= 1
        j += 1

    return True

def solve_n_queens(board, row, n):
    """Use backtracking to place queens on the board."""
    # Base case: all queens placed
    if row == n:
        print_solution(board)
        return

    # Try placing queen in each column
    for col in range(n):
        if is_safe(board, row, col, n):
            board[row][col] = 'Q'  # Place queen
            solve_n_queens(board, row + 1, n)
            board[row][col] = '.'  # Backtrack

def n_queens(n):
    """Initialize board and start solving."""

    global sol_c
    sol_c = 0
    board = [['.' for _ in range(n)] for _ in range(n)]
    print(f"Solutions for {n}-Queens problem:\n")
    solve_n_queens(board, 0, n)


# Example: Run for 4-Queens
n_queens(5)
