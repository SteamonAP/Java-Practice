import java.util.Scanner;

public class calc {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int ans = 0;

        while (true) {
            System.out.println("Enter operator : ");
            char op = in.next().trim().charAt(0);
            if (op == '+' || op == '-' || op == '*' || op == '/' || op == '%'){
                System.out.println("Enter num1: ");
                int num1 = in.nextInt();
                System.out.println("Enter num2: ");
                int num2 = in.nextInt();

                if (op == '+'){
                    ans = num1 + num2;
                } else if (op == '-') {
                    ans = num1 - num2;
                } else if(op == '*') {
                    ans = num1 * num2;
                } else if(op == '/') {
                    if (num2 != 0) {
                        ans = num1 / num2;
                    }
                } else if(op == '%'){
                    ans = num1 % num2;
                }
            } else if (op == 'x' || op == 'X') {
                break;
            } else {
                System.out.println("Invalid input");
            }
            System.out.println(ans);
            
        }
    }
    
}
