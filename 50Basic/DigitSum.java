import java.util.*;

class DigitSum {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int N = Integer.parseInt(sc.nextLine().trim());
        int R = Integer.parseInt(sc.nextLine().trim());
        if (R ==0){
            System.out.print(0);
            return;
        }
        int sum = 0;
        while (N > 0){
            int digit = N % 10;
            sum += digit;
            N = N/10;
        }
        int ans = sum * R;
        int result = 0;
       while (ans >= 10){
           result = 0;
           while(ans > 0){
               int digit = ans % 10;
               result += digit;
               ans = ans/10;
           }
           ans = result;
       }
        
        
        System.out.print(ans);
    }
}