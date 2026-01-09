import java.util.Scanner;

public class reverseStr {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        System.out.print(reverStr(s));
    }

    // static String reverStr(String s) {
    
    //     return new StringBuilder(s).reverse().toString();
    // }
    // static String reverStr(String s) {
    //     StringBuilder sb  = new StringBuilder();

    //     for (int i = s.length() - 1; i >= 0; i--) {
    //         sb.append(s.charAt(i));
    //     }
    //     return sb.toString();
    // }

    static String reverStr(String s) {
        char[] arr = s.toCharArray();
        int start = 0; 
        int end = arr.length - 1;

        while (start < end) {
            char temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
        return new String(arr);

    }
}
