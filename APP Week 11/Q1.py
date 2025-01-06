def find_largest(arr):
    largest = arr[0]
    second_largest = arr[1]
    for i in range(2, len(arr)):
        if arr[i] > largest:
            second_largest = largest
            largest = arr[i]
        elif arr[i] > second_largest:
            second_largest = arr[i]
    return largest, second_largest

# Example usage
arr = [10, 20, 4, 45, 99]
largest, second_largest = find_largest(arr)
print("First largest number:", largest)
print("Second largest number:", second_largest)