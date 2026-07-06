import java.util.*;

public class alternateUppercase {
    

    public static String altUpperCase(String str) {
        if (str == null || str.length() == 0){
            return str;
        }


        StringBuilder result = new StringBuilder();

        for (int i = 0; i < str.length() ; i++) {
            char ch = str.charAt(i);

            if (i %2 == 0){
                result.append(Character.toUpperCase(ch));
            } else {
                result.append(Character.toLowerCase(ch));
            }
        }

        return result.toString();
    }


    public static String alternateWordCase(String str) {
        String[] words = str.split(" ");

        StringBuilder result = new StringBuilder();

        for (int i = 0 ; i < words.length; i++) {
            if (i % 2 == 0){
                result.append(words[i].toLowerCase());
            }else {
                result.append(words[i].toUpperCase());
            }

            if (i < words.length - 1) {
                result.append(" ");
            }
        }

        return result.toString();
    }
}
