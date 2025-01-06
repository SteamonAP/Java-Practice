import java.util.Random;
import java.util.Scanner;

public class Week4Q2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int numberToGuess = random.nextInt(9) + 1;
        int userGuess;

        System.out.println("Guess a number between 1 and 9.");

        do {
            System.out.print("Enter your guess: ");
            userGuess = scanner.nextInt();

            if (userGuess == numberToGuess) {
                System.out.println("Well guessed! The number was " + numberToGuess + ".");
                break;
            } else {
                System.out.println("Incorrect guess. Try again.");
            }
        } while (true);

        scanner.close();
    }
}
