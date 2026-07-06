import java.util.*;

public class PrintDivisor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        List<Integer> divisors = new ArrayList<>();

        for (int i = 1; i * i <= n; i++) {
            if (n % i == 0) {
                divisors.add(i);

                if (i != n / i) {
                    divisors.add(n / i);
                }
            }
        }

        Collections.sort(divisors);

        System.out.println(" DIvisors: ");
        for (int d : divisors) {
            System.out.print(d + " ");
        }
    }
}
