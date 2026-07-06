
import java.util.*;
public class Factorial {
    public static void main(String[] args) {
        System.out.println(facto(4));
    }
    // public static int facto(int n){
    //     if(n == 0){
    //         return 1;
    //     }
    //     int ans = n * facto(n-1);
    //     return ans;

    // }

    //without *

    public static int facto(int n){
        if (n == 0) return 1;
        return multiply(n,facto(n-1));
    }

    public static int multiply(int a , int b){
        int result = 0;
        for(int i = 0; i < b ; i++){
            result = add(result, a);
        }
        return result;
    }

    public static int add(int a, int b){
        while(b != 0){
            int carry = a & b;
            a = a ^ b;
            b = carry << 1;
        }
        return a;
    }

}
