import java.util.Scanner;

public class Week4Q9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the first integer: ");
        int num1 = scanner.nextInt();
        System.out.print("Enter the second integer: ");
        int num2 = scanner.nextInt();
        scanner.close();

        int sum = num1 + num2;
        int result = (sum >= 105 && sum <= 200) ? 200 : sum;

        System.out.println("Result: " + result);
    }
}
