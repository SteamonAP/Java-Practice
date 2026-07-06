import java.util.*;

public class setBitsCount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine().trim());

        int ans = bitcount(n);
        System.out.println(Integer.toBinaryString(n));
        System.out.println(ans);
    }

    public static int bitcount(int n) {
        int count = 0;

        // while (n != 0) {
        //     if ((n & 1) == 1) {
        //         count++;
        //     }
        //     n = n >> 1;
        // }
        while(n != 0 ){
            n = n & (n - 1);
            count++;
        }


        return count;
    }
}
