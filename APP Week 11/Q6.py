def matrix_multiplication(A, B):
    if len(A[0]) != len(B):
        print("Matrices are not compatible for multiplication")
        return None
    C = [[0 for _ in range(len(B[0]))] for _ in range(len(A))]
    for i in range(len(A)):
        for j in range(len(B[0])):
            for k in range(len(B)):
                C[i][j] += A[i][k] * B[k][j]
    return C

# Example usage
A = [[1, 2, 3], [4, 5, 6], [7, 8, 9]]
B = [[9, 8, 7], [6, 5, 4], [3, 2, 1]]
C = matrix_multiplication(A, B)
if C is not None:
    print("Result of matrix multiplication:")
    for row in C:
        print(row)

