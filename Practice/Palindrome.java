import java.util.*;

public class Palindrome {

    public static boolean isPalindromeNumber(int n) {
        if (n < 0)
            return false;
        int original = n;

        int reversed = 0;

        while (n > 0) {
            int digit = n % 10;
            reversed = reversed * 10 + digit;
            n /= 10;
        }

        return original == reversed;
    }

    public static boolean isPalindromeString(String str) {
        StringBuilder sb = new StringBuilder(str);

        String reversed = sb.reverse().toString();

        return str.equals(reversed);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter which palindrome to check (number/string): ");
        String input = sc.next();
        switch (input) {
            case "number":
                System.out.print("Enter number: ");
                int num = sc.nextInt();
                System.out.println(
                        isPalindromeNumber(num)
                                ? num + " is a palindrome"
                                : num + " is not a palindrome");
                break;
            case "string":
                System.out.print("Enter string: ");
                String str = sc.next();
                System.out.println(
                        isPalindromeString(str)
                                ? str + " is a palindrome"
                                : str + " is not a palindrome");
                break;
            default:
                System.out.println("Invalid choice");
        }

        sc.close();

    }
}
