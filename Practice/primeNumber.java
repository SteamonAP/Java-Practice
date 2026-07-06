import java.util.*;

public class primeNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter range (start end): ");
        int start = scanner.nextInt();
        int end = scanner.nextInt();

        long startTime = System.nanoTime();
        List<Integer> primes = sieveOfEratosthenes(start, end);
        long endTime = System.nanoTime();

        System.out.println("\nPrime numbers: " + primes);
        System.out.println("Count: " + primes.size());
        System.out.println("Time: " + (endTime - startTime) / 1000000.0 + " ms");

        scanner.close();
    }

    public static List<Integer> sieveOfEratosthenes(int start, int end) {
        List<Integer> primes = new ArrayList<>();

        if (end < 2)
            return primes;

        boolean[] isPrime = new boolean[end + 1];
        Arrays.fill(isPrime, true);
        isPrime[0] = isPrime[1] = false;

        for (int i = 2; i * i <= end; i++) {
            if (isPrime[i]) {
                for (int j = i * i; j <= end; j += i) {
                    isPrime[j] = false;
                }
            }
        }

        for (int i = Math.max(2, start); i <= end; i++) {
            if (isPrime[i]) {
                primes.add(i);
            }
        }
        return primes;
    }
}
