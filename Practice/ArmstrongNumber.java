import java.util.*;

public class ArmstrongNumber {

    // public static void main(String[] args) {

    //     Scanner sc = new Scanner(System.in);

    //     int n = sc.nextInt();

    //     int original = n;
    //     int sum = 0;
    //     int digits = String.valueOf(n).length();

    //     while (n > 0) {
    //         int digit = n % 10;
    //         sum += Math.pow(digit, digits);
    //         n /= 10;
    //     }

    //     if (sum == original) {
    //         System.out.println(original + " is an Armstrong number");
    //     } else {
    //         System.out.println(original + " is not an Armstrong number");
    //     }

    //     sc.close();
    // }

    public static void main(String[] args) {
        System.out.println("Armstrong numbers between 1 and 1000:");
        for (int i = 1; i <= 1000; i++) {
            if (isArmstrong(i)) {
                System.out.print(i + " ");
            }
        }
    }


    public static boolean isArmstrong(int num) {

        int original = num;
        int sum = 0;
        int digits = String.valueOf(num).length();

        while (num > 0) {
            int digit = num % 10;
            sum += Math.pow(digit, digits);
            num /= 10;
        }

        return sum == original;


    } 

}
