import java.util.Scanner;

public class Week5Q6 {
    public static void findMissingDigits(String mobileNumber) {
        boolean[] digitsPresent = new boolean[10];

        for (char digitChar : mobileNumber.toCharArray()) {
            if (Character.isDigit(digitChar)) {
                int digit = digitChar - '0';
                digitsPresent[digit] = true;
            }
        }

        System.out.println("Digits absent in the mobile number:");
        for (int i = 0; i < 10; i++) {
            if (!digitsPresent[i]) {
                System.out.print(i + " ");
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a mobile number: ");
        String mobileNumber = scanner.nextLine();
        scanner.close();

        findMissingDigits(mobileNumber);
    }
}
