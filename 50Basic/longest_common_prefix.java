import java.util.*;

public class longest_common_prefix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = Integer.parseInt(sc.nextLine().trim());
        String[] arr = sc.nextLine().trim().split("\\s+");

        System.out.print(longest_common_prefix(arr));
    }

    public static String longest_common_prefix(String[] s) {

        if (s == null || s.length == 0) {
            return "";
        }
        StringBuilder result = new StringBuilder();

        Arrays.sort(s);

        String firstL = s[0];
        String lastL = s[s.length - 1];

        int minLen = Math.min(firstL.length(), lastL.length());

        for (int i = 0; i < minLen; i++) {
            if (firstL.charAt(i) != lastL.charAt(i)) {
                break;
            }
            result.append(firstL.charAt(i));

        }

        return result.toString();

    }

}