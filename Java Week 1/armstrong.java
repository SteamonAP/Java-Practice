import java.util.Scanner;

public class armstrong {
    

    static boolean armstrong(int n){
        int og = n;
        int sum = 0;

        while (n > 0) {
            int rem = n % 10;
            n = n/10;
            sum = sum + rem*rem*rem;
             
        }
        return sum == og;

    }
    public static void main(String[] args) {
        // Scanner in = new Scanner(System.in);
        // System.out.println("enter number");
        // int n = in.nextInt();
        // boolean ans = armstrong(n);
        // System.out.println("The answer: " + ans );

        for (int i = 100; i <= 1000 ; i++){
            if (armstrong(i)){
                System.out.print(i + " ");
            }
        }

    }
}
