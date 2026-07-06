import java.util.*;

public class NTHMAGIC {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine().trim());

        int ans = magic(n);
        System.out.println(ans);
    }

    public static int magic(int n){
        int answer = 0;

        for(int i = 0; i < 32; i++){
            int bit  = ((n >> i) & 1);
            answer += bit * (int)Math.pow(5, i + 1);
        }

        return answer;
    }
}
