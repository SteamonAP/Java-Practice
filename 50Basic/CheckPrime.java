import java.util.*;

public class CheckPrime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        boolean ans = isPrimeno(n);
        if (ans == true){
            System.out.println("Prime");
        } else {
            System.out.println("Not prime");
        }

    }


    public static boolean isPrimeno(int n) {
        if (n <= 1){
            return false;
        }

        boolean isPrime = true;
        for (int i = 2; i * i <= n;i++) {
            if (n % i ==0){
                isPrime = false;
                break;
            }
        }


        if (isPrime){
            return true;
        }
        return false;  

    }
}
