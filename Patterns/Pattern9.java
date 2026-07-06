import java.util.*;

public class Pattern9 {

    public static void main(String[] args) {
        pattern9(5);
    }

    static void pattern9(int n) {
        int originalN = n;
        n = 2 * n;
        for (int row = 0; row <= n; row++) {
            for (int col = 0; col <= n; col++) {
                int idxVal = originalN - Math.min(Math.min(row, col), Math.min(n-row, n-col));
                System.out.print(idxVal + " ");
            }
            System.out.println();
        }
    }
}
