import java.util.*;

public class PythagoreanTripletDetailed {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter three numbers: ");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        String result = checkPythagoreanTriplet(a, b, c);
        System.out.println("\nResult: " + result);

        System.out.print("Enter upper limit: ");
        int limit = scanner.nextInt();

        generateTriplets(limit);

        scanner.close();
    }

    public static String checkPythagoreanTriplet(int a, int b, int c) {
        int aSq = a * a;
        int bSq = b * b;
        int cSq = c * c;

        if (aSq + bSq == cSq) {
            return String.format("%d² + %d² = %d² (%d + %d = %d)", a, b, c, aSq, bSq, cSq);
        } else if (aSq + cSq == bSq) {
            return String.format("%d² + %d² = %d² (%d + %d = %d)", a, c, b, aSq, cSq, bSq);
        } else if (bSq + cSq == aSq) {
            return String.format("%d² + %d² = %d² (%d + %d = %d)", b, c, a, bSq, cSq, aSq);
        }

        return "Not a triplet";
    }

    public static void generateTriplets(int limit) {

        System.out.println("Pythagorean triplets up to " + limit + ":\n");

        int count = 0;

        for (int a = 1; a <= limit; a++) {
            for (int b = a; b <= limit; b++) {
                int cSq = a * a + b * b;
                int c = (int) Math.sqrt(cSq);

                if (c <= limit && c * c == cSq) {
                    count++;
                    System.out.printf("%d. (%d, %d, %d) → %d² + %d² = %d²\n",
                            count, a, b, c, a, b, c);
                }
            }
        }

        System.out.println("\nTotal triplets found: " + count);

    }

}