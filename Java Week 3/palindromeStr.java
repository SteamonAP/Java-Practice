import java.util.*;

public class palindromeStr {

    public static boolean chkPalin(String str) {
        if (str == null || str.length() == 0 ) {
            return true;
        }
        str = str.toLowerCase();
        int n = str.length();

        int s = 0;
        int e = n - 1;

        while (s <= e) {
            if (str.charAt(s) != str.charAt(e)) {
                return false;
            }
            s++;
            e--;

        }
        return true;
    }

    public static void main(String[] args) {
        String st = "aaaaa";

        System.out.println(chkPalin(st));

    }
}
