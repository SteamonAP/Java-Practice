import math

def calculate_circle_area(radius):
    return math.pi * radius**2

def calculate_circle_perimeter(radius):
    return 2 * math.pi * radius

def calculate_rectangle_area(length, width):
    return length * width

def calculate_rectangle_perimeter(length, width):
    return 2 * (length + width)

def calculate_triangle_area(base, height):
    return 0.5 * base * height

def calculate_triangle_perimeter(side1, side2, side3):
    return side1 + side2 + side3

print("Geometric Shape Calculator")
print("1. Circle")
print("2. Rectangle")
print("3. Triangle")

choice = int(input("Enter your choice (1/2/3): "))

if choice == 1:
    radius = float(input("Enter the radius of the circle: "))
    area = calculate_circle_area(radius)
    perimeter = calculate_circle_perimeter(radius)
    print(f"Area of the circle: {area}")
    print(f"Perimeter of the circle: {perimeter}")

elif choice == 2:
    length = float(input("Enter the length of the rectangle: "))
    width = float(input("Enter the width of the rectangle: "))
    area = calculate_rectangle_area(length, width)
    perimeter = calculate_rectangle_perimeter(length, width)
    print(f"Area of the rectangle: {area}")
    print(f"Perimeter of the rectangle: {perimeter}")

elif choice == 3:
    base = float(input("Enter the base length of the triangle: "))
    height = float(input("Enter the height of the triangle: "))
    area = calculate_triangle_area(base, height)
    side1 = float(input("Enter the length of side 1: "))
    side2 = float(input("Enter the length of side 2: "))
    side3 = float(input("Enter the length of side 3: "))
    perimeter = calculate_triangle_perimeter(side1, side2, side3)
    print(f"Area of the triangle: {area}")
    print(f"Perimeter of the triangle: {perimeter}")

else:
    print("Invalid choice. Please select 1, 2, or 3.")