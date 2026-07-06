import java.util.*;

public class SubtractProductAndSum {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        int temp = n;
        int prod = 1;
        int sum = 0;

        while (temp > 0) {
            int digit = temp % 10;
            prod *= digit;
            sum += digit;
            temp /= 10;

        }

        int result = prod - sum;

        System.out.println("Product of digits: " + prod);
        System.out.println("Sum of digits: " + sum);
        System.out.println("Product - Sum: " + result);

        sc.close();

    }

}
