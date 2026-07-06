import java.util.*;

public class NCR_NPR {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter n: ");
        int n = scanner.nextInt();

        System.out.print("Enter r: ");
        int r = scanner.nextInt();

        System.out.println(n + "C" + r + " = " + nCr(n, r));
        System.out.println(n + "P" + r + " = " + nPr(n, r));

        scanner.close();
    }

    public static long factorial(int n) {
        long result = 1;
        for (int i = 2; i <= n; i++) {
            result *= i;
        }
        return result;
    }

    public static long nCr(int n, int r) {
        if (r > n) return 0;

        return factorial(n) / (factorial(r) * factorial(n-r));
    }

    public static long nPr(int n, int r) {
        if (r > n) return 0;

        return factorial(n) / factorial(n - r);
    }
}
