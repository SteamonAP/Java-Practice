import java.util.Scanner;

public class reverse {

    public static int reverse(int n){

        int newn = 0;
        while (n > 0) {
            int rem = n % 10;
            newn = newn * 10 + rem;
            
            n = n / 10;
        }
        return newn;

    }
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int n = inp.nextInt();
        System.out.println("The Reverse of your num is: " + reverse(n));
    }
    
}
