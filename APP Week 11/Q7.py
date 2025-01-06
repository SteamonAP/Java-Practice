n = 3  # Change this value to adjust the size of the diamond

# Upper half of the diamond
for i in range(1, n + 1):
    for j in range(1, i * 2):
        print(j, end="")
    print()

# Lower half of the diamond
for i in range(n - 1, 0, -1):
    for j in range(1, i * 2):
        print(j, end="")
    print()