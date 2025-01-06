def generate_fibonacci(n):
    if n <= 0:
        return []
    elif n == 1:
        return [0]
    elif n == 2:
        return [0, 1]
    else:
        fibonacci_sequence = [0, 1]
        while len(fibonacci_sequence) < n:
            next_number = fibonacci_sequence[-1] + fibonacci_sequence[-2]
            fibonacci_sequence.append(next_number)
        return fibonacci_sequence


n_terms = int(input("Enter the number of Fibonacci terms to generate: "))

if n_terms <= 0:
    print("Please enter a positive number of terms.")
else:
    fibonacci_sequence = generate_fibonacci(n_terms)
    print(f"Fibonacci sequence with {n_terms} terms: {fibonacci_sequence}")