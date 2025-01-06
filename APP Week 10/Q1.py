def calculate_sum_two_numbers(a, b):
    return a + b

def calculate_sum_three_numbers(a, b, c):
    return a + b + c

def check_and_return_sum_result(sum_result):
    if 120 <= sum_result <= 320:
        return 200
    else:
        return sum_result


num1 = float(input("Enter the first number: "))
num2 = float(input("Enter the second number: "))


sum_two_numbers = calculate_sum_two_numbers(num1, num2)


num3 = float(input("Enter the third number: "))


sum_three_numbers = calculate_sum_three_numbers(num1, num2, num3)

result = check_and_return_sum_result(sum_three_numbers)

print("Sum Result:", result)