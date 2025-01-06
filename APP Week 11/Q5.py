def remove_duplicates(arr):
    seen = set()
    result = []
    for num in arr:
        if num not in seen:
            seen.add(num)
            result.append(num)
    return result

# Example usage
arr = [1, 2, 3, 2, 1, 4, 5, 4, 6, 7, 6, 8, 9]
unique_arr = remove_duplicates(arr)
print("List with duplicates removed:", unique_arr)