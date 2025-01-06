import java.util.Scanner;

public class Week5Q9 {
    public static void generateCombinations(String input) {
        if (input.length() != 3) {
            System.out.println("Please enter exactly 3 digits.");
            return;
        }

        char[] digits = input.toCharArray();

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                for (int k = 0; k < 3; k++) {
                    if (i != j && i != k && j != k) {
                        System.out.println(digits[i] + "" + digits[j] + "" + digits[k]);
                    }
                }
            }
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a 3-digit number: ");
        String input = scanner.nextLine();

        scanner.close();

        generateCombinations(input);
    }
}
