import java.util.*;

public class BasePower {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int b = Integer.parseInt(sc.nextLine().trim());
        int p = Integer.parseInt(sc.nextLine().trim());

        int ans = power(b,p);
        System.out.println(ans);
    }

    public static int power(int b, int p){
        int ans = 1;

        while(p > 0){
            if((p & 1) == 1){
                ans *= b;
            }
            b *= b;
            p = p >> 1;
        }
        return ans;
    }
}
