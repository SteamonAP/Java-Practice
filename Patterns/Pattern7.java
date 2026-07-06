import java.util.*;
public class Pattern7 {
    public static void main(String[] args) {
        pattern7(5);
    }

    static void pattern7(int n) {
        for (int i = 1; i <2 *  n; i++) {
            int c = i > n ? 2 * n - i : i;
            for (int s = 0; s < n - c; s++) {
                System.out.print(" ");
            } 
            for (int j = c; j >=  1; j--) {
                System.out.print(j);
            }
            for (int k = 2; k <= c;k++){
                System.out.print(k);

            }
            System.out.println();
        }
    }
}
