import java.util.*;

public class PhonePad {
    public static void main(String[] args) {
        pad("", "12");
        System.out.println(padlist("", "12"));
        System.out.println("Count combo : " +countpadList("","12"));
    }

    static void pad(String p, String up) {
        if (up.isEmpty()) {
            System.out.println(p);
            return;
        }
        int digit = up.charAt(0) - '0';
        for (int i = (digit - 1) * 3; i < digit * 3; i++) {
            char ch = (char) ('a' + i);
            pad(p + ch, up.substring(1));
        }
    }

    static ArrayList<String> padlist(String p, String up) {
        if (up.isEmpty()) {
            ArrayList<String> ans = new ArrayList<>();
            ans.add(p);
            return ans;
        }

        int digit = up.charAt(0) - '0';
        ArrayList<String> list = new ArrayList<>();
        for (int i = (digit - 1) * 3; i < digit * 3; i++) {
            char ch = (char) ('a' + i);
            list.addAll(padlist(p + ch, up.substring(1)));
        }
        return list;
    }

    static int countpadList(String p, String up) {
        if (up.isEmpty()) {
            return 1;
        }
        int count = 0;
        int digit = up.charAt(0) - '0';

        for (int i = (digit - 1) * 3; i < digit * 3; i++) {
            char ch = (char)('a' + i);
            count += countpadList(p + ch, up.substring(1));
        }
        return count;
    }
}
