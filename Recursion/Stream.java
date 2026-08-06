public class Stream {
    public static void main(String[] args) {
        skip("", "baccdah");
        System.out.println(skip2("baccdah"));
        System.out.println(skipApple("appyyapplezz"));
        StringBuilder sb = new StringBuilder();
        skipApple2("appyyapplezz", 0, sb);
        System.out.println("SB ans : " + sb);
    }

    static void skip(String p, String up) {
        if (up.isEmpty()) {
            System.out.println(p);
            return;
        }
        char ch = up.charAt(0);

        if (ch == 'a') {
            skip(p, up.substring(1));
        } else {
            skip(p + ch, up.substring(1));
        }
    }

    static String skip2(String up) {
        if (up.isEmpty()) {
            return "";
        }
        char ch = up.charAt(0);

        if (ch == 'a') {
            return skip2(up.substring(1));
        } else {
            return ch + skip2(up.substring(1));
        }
    }

    static String skipApple(String up) {
        if (up.isEmpty()) {
            return "";
        }
        if (up.startsWith("app") && !up.startsWith("apple")) {
            return skipApple(up.substring(3));
        } else {
            return up.charAt(0) + skipApple(up.substring(1));
        }
    }

    static void skipApple2(String s, int i, StringBuilder ans) {
        if (i >= s.length()) {
            return;
        }
        if (i + 3 <= s.length() && s.startsWith("app" , i) && !s.startsWith("apple" , i)) {
            skipApple2(s, i + 3, ans);
        } else {
            ans.append(s.charAt(i));
            skipApple2(s, i + 1, ans);
        }
    }
}
