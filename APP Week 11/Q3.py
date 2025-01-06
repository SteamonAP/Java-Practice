def count_occurrences(arr, num):
    count = 0
    for i in arr:
        if i == num:
            count += 1
    return count

# Example usage
arr = [1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 10, 10]
num = 10
occurrences = count_occurrences(arr, num)
print("Number of occurrences of", num, "in the array:", occurrences)