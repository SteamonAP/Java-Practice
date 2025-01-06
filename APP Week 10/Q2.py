def find_maximum_of_three_numbers(a, b, c):
    max_number = max(a, b, c)
    return max_number


num1 = float(input("Enter the first number: "))
num2 = float(input("Enter the second number: "))
num3 = float(input("Enter the third number: "))

maximum = find_maximum_of_three_numbers(num1, num2, num3)

print("The maximum of the three numbers is:", maximum)