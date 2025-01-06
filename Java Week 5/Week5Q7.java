import java.util.Scanner;

public class Week5Q7 {
    public static boolean checkValues(int num1, int num2) {
        return (num1 == num2 || num1 + num2 == 5 || Math.abs(num1 - num2) == 5);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first integer: ");
        int num1 = scanner.nextInt();

        System.out.print("Enter the second integer: ");
        int num2 = scanner.nextInt();

        scanner.close();

        boolean result = checkValues(num1, num2);

        if (result) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }
    }
}
