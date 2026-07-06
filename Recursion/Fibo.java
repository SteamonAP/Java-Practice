import java.util.*;

public class Fibo {
    public static void main(String[] args) {
        // int ans = fibo(50);
        double result = fiboFormula(50);
        // System.out.println(ans);
        System.out.println(result);
    }

    public static int fibo(int n){

        if (n < 2){
            return n;
        }
        
        return fibo(n - 1) + fibo(n - 2);
    }

    public static double fiboFormula(double n){
        // return (int) Math.round((Math.pow(((1 + Math.sqrt(5)) / 2),n)) / Math.sqrt(5));
        return (double) Math.round((Math.pow((1 + Math.sqrt(5)) / 2, n) - Math.pow((1 - Math.sqrt(5)) / 2, n)) / Math.sqrt(5));
    }
}
