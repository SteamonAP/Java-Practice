import java.util.Scanner;

public class SumUntilZero {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int sum = 0;
        int n;

        System.out.println("Enter integers (enter 0 to stop):");

        while (true) {

            n = sc.nextInt();

            if (n == 0) {
                break;
            }

            sum += n;
            
        }
        System.out.println("Sum of all numbers: " + sum);

        sc.close();
    }

}
