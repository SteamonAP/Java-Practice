/*Given a string containing parentheses and lowercase letters,
 remove the minimum number of parentheses so the resulting string is valid.

    "lee(t(c)o)de)" → "lee(t(c)o)de"
    "a)b(c)d" → "ab(c)d"
*/

import java.util.*;

public class interviewStr {
    // Tc = O(n);
    // SC = O(n);
    static class Result {
        String validString;
        int removedCount;

        Result(String valString, int removedCount) {
            this.validString = valString;
            this.removedCount = removedCount;
        }
    }
    // public static Result minRemoveToMakeValid(String s) {
    // StringBuilder sb = new StringBuilder(s);

    // int open = 0;
    // int removed = 0;

    // // Pass 1
    // for (int i = 0; i < sb.length(); i++) {
    // char c = sb.charAt(i);

    // if (c == '(') {
    // open++;
    // } else if (c == ')') {
    // if (open == 0) {
    // sb.setCharAt(i, '*');
    // removed++;
    // } else {
    // open--;
    // }
    // }
    // }

    // // Pass 2:
    // for (int i = sb.length() - 1; i >= 0 && open > 0; i--) {
    // if (sb.charAt(i) == '(') {
    // sb.setCharAt(i, '*');
    // removed++;
    // open--;
    // }
    // }

    // StringBuilder result = new StringBuilder();

    // for (int i = 0; i < sb.length(); i++) {
    // if (sb.charAt(i) != '*') {
    // result.append(sb.charAt(i));
    // }
    // }

    // return new Result(result.toString(), removed);
    // }

    // TC= O(n);
    // SC= O(1);

    public static Result correctString(String s) {

        char[] chars = s.toCharArray();
        int open = 0;
        int removed = 0;

        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == '(') {
                open++;
            } else if (chars[i] == ')') {
                if (open == 0) {
                    chars[i] = '\0';
                    removed++;
                } else {
                    open--;
                }
            }
        }

        for (int i = chars.length - 1; i >= 0 && open > 0; i--) {
            if (chars[i] == '(') {
                chars[i] = '\0';
                removed++;
                open--;
            }
        }

        int write = 0;
        for (int read = 0; read < chars.length; read++) {
            if (chars[read] != '\0') {
                chars[write++] = chars[read];
            }
        }

        return new Result(new String(chars, 0, write), removed);

    }

    public static void main(String[] args) {

        String[] tests = {
                "lee(t(c)o)de)",
                "a)b(c)d",
                "))((",
                "abc",
                "((a)",
                ""
        };

        for (String test : tests) {
            Result res = correctString(test);
            System.out.println("Input    : \"" + test + "\"");
            System.out.println("Output   : \"" + res.validString + "\"");
            System.out.println("Removed  : " + res.removedCount);
            System.out.println("-------------------------");
        }
    }
}
