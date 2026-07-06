import java.util.*;

public class CheckSQRT {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int ans = sqrt(n);
        System.out.println(ans);
    }    
    public static int sqrt(int n){
        int ans = (int)Math.sqrt(n);
        return ans;
    }
}
