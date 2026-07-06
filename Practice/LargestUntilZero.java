import java.util.Scanner;

public class LargestUntilZero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int largest = Integer.MIN_VALUE;
        int n;
        boolean hasInput = false;

        System.out.println("Enter integers (enter 0 to stop):");

        while (true) {

            n = sc.nextInt();

            if (n == 0) {
                break;
            }

            hasInput = true;

            if (n > largest) {
                largest = n;
            }

        }

        if (hasInput) {
            System.out.println("Largest number: " + largest);
        } else {
            System.out.println("No numbers were entered.");
        }

        sc.close();

    }
}
