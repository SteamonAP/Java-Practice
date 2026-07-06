import java.util.*;

public class SumDigits {
    public static void main(String[] args) {
        System.out.println(sumD(54321));
        System.out.println(prodD(54321));
    }

    static int sumD(int n){
        if(n==0){
            return 0;
        }

        int digits = n % 10;
        return digits + sumD(n/10);
    }
    static int prodD(int n){
        if(n%10==n){
            return n;
        }

        int digits = n % 10;
        
        int prod = digits * prodD(n/10);
        return prod;
    }
}
