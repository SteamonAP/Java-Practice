 import re

def is_strong_password(password):
    # Define evaluation criteria
    length_criteria = len(password) >= 8
    lowercase_criteria = any(char.islower() for char in password)
    uppercase_criteria = any(char.isupper() for char in password)
    digit_criteria = any(char.isdigit() for char in password)
    special_character_criteria = re.search(r'[!@#$%^&*()_+{}\[\]:;<>,.?~\\-]', password) is not None

    criteria = [length_criteria, lowercase_criteria, uppercase_criteria, digit_criteria, special_character_criteria]

    return all(criteria)

# Get a password from the user
password = input("Enter a password: ")

# Check the strength of the password
if is_strong_password(password):
    print("Password is strong. Good job!")
else:
    print("Password is not strong. Please consider the following:")
    
    if not length_criteria:
        print("- Password should be at least 8 characters long")
    if not lowercase_criteria:
        print("- Password should contain at least one lowercase letter")
    if not uppercase_criteria:
        print("- Password should contain at least one uppercase letter")
    if not digit_criteria:
        print("- Password should contain at least one digit")
    if not special_character_criteria:
        print("- Password should contain at least one special character (!@#$%^&*()_+{}[]:;<>,.?~\\-)")