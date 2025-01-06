import java.util.Scanner;

public class Week4Q5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();
        scanner.close();

        int letterCount = 0;
        int digitCount = 0;

        for (char c : input.toCharArray()) {
            if (Character.isLetter(c)) {
                letterCount++;
            } else if (Character.isDigit(c)) {
                digitCount++;
            }
        }

        System.out.println("Letters " + letterCount);
        System.out.println("Digits " + digitCount);
    }
}
