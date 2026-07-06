import java.util.*;

public class CountZeros {
    public static void main(String[] args) {
        //System.out.println(cnt(30204));
        System.out.println(reccnt(30204));
    }

    static int cnt(int n) {
        int count = 0;

        while (n > 0) {
            int rem = n % 10;
            if (rem == 0) {
                count++;
            }
            n = n / 10;

        }

        return count;
    }
    static int reccnt(int n) {
        if(n==0) return 1;  
        return count(n, 0);
    }

    static int count(int n, int c){
        if(n==0){
            return c;
        }

        int rem = n % 10;
        if(rem == 0){
            return count(n/10, c+1);
        }
        return count(n/10, c);
    }
}
