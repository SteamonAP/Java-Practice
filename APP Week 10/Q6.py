def generate_fibonacci_sequence(n):
    fibonacci_sequence = []
    a, b = 0, 1

    while len(fibonacci_sequence) < n:
        fibonacci_sequence.append(a)
        a, b = b, a + b

    return fibonacci_sequence


num_terms = int(input("Enter the number of Fibonacci terms to generate: "))

if num_terms <= 0:
    print("Please enter a positive integer.")
else:
    fibonacci_sequence = generate_fibonacci_sequence(num_terms)
    print("Fibonacci Sequence:")
    for term in fibonacci_sequence:
        print(term, end=" ")