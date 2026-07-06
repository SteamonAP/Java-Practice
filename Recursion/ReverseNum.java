import java.util.*;

public class ReverseNum {
    public static void main(String[] args) {
        
        System.out.println(rev1(12345,0));
        System.out.println(rev2(12345));
    }

    static int rev1(int n, int sum){
        if (n == 0){
            return sum;
        }
        int digit = n % 10;
        sum = sum * 10 + digit;
        return rev1(n/10, sum);
    }

    static int rev2(int n){
        int count = (int)Math.log10(n) + 1;
        return calc(n,count);
    }

    static int calc(int n, int count){
        if(n%10==n){
            return n;
        }
        int rem = n % 10;
        return rem * (int)(Math.pow(10,count-1)) + calc(n/10, count-1);
    }
}
