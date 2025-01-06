# Input complex numbers
complex_num1 = complex(input("Enter the first complex number (in the form a+bj): "))
complex_num2 = complex(input("Enter the second complex number (in the form a+bj): "))

# Perform arithmetic operations
addition_result = complex_num1 + complex_num2
subtraction_result = complex_num1 - complex_num2
multiplication_result = complex_num1 * complex_num2
division_result = complex_num1 / complex_num2

# Display results
print(f"Addition: {complex_num1} + {complex_num2} = {addition_result}")
print(f"Subtraction: {complex_num1} - {complex_num2} = {subtraction_result}")
print(f"Multiplication: {complex_num1} * {complex_num2} = {multiplication_result}")
print(f"Division: {complex_num1} / {complex_num2} = {division_result}")