import random

# Generate a random number between 1 and 100
random_number = random.randint(1, 100)

attempts = 0

while True:
    try:
        user_guess = int(input("Guess the number (between 1 and 100): "))
        attempts += 1

        if user_guess < random_number:
            print("Too low! Try again.")
        elif user_guess > random_number:
            print("Too high! Try again.")
        else:
            print(f"Congratulations! You guessed the number {random_number} correctly in {attempts} attempts.")
            break
    except ValueError:
        print("Please enter a valid number between 1 and 100.")