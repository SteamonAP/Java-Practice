import java.util.*;

public class ReverseString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter String : ");

        String str1 = sc.next();

        String str2 = "";

        for (int i = str1.length() - 1 ; i >= 0 ; i--) {
            str2 += str1.charAt(i);
        }

        System.out.println("Reversed (loop): " + str2);

        /// String builder
        StringBuilder sb = new StringBuilder(str1);

        String str3 = sb.reverse().toString();
        System.out.println("Reversed (StringBuilder): " + str3);

        System.out.println("Reversed (recursion): " + reverseRecursive(str1));
    }

    public static String reverseRecursive(String str) {
        if (str.isEmpty()) {
            return str;
        }

        return reverseRecursive(str.substring(1)) + str.charAt(0);
    }
}
