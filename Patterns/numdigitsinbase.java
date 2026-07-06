import java.util.Scanner;

public class numdigitsinbase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine().trim());
        int b = Integer.parseInt(sc.nextLine().trim());

        int ans = digits(n,b);
        System.out.println(ans);
    }

    public static int digits(int n, int b){
        int ans = (int)(Math.log(n)/ Math.log(b)) + 1;
        return ans;
    }
}
