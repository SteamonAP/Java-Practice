import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        char ch = in.next().trim().charAt(0);

        if (ch >= 'a' && ch <= 'z') {
            System.out.println("LowerCase: " + ch);
        } else 
        {
            System.out.println("UpperCase: " + ch);
        }
    }
}
