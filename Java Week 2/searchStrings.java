import java.util.Scanner;

public class searchStrings {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String n = "AMoghpitale";

        char target = in.next().charAt(0);
        System.out.println(search2(n, target));
    }

    static boolean search(String str, char target) {
        if (str.length() == 0) return false;

        for (int i = 0; i < str.length(); i++) {
            if (target == str.charAt(i)) {
                return true;
            }
        }
        return false;

    }
    static boolean search2(String str, char target) {
        if (str.length() == 0) return false;

        for (char ch : str.toCharArray()){
            if (ch == target) {
                return true;
            }
        }
        return false;

    }
}
