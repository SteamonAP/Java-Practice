import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Week5Q8 {
    public static Map<Character, Integer> countCharacters(String text) {
        Map<Character, Integer> charCountMap = new HashMap<>();

        for (char c : text.toCharArray()) {
            if (Character.isLetterOrDigit(c)) {
                charCountMap.put(c, charCountMap.getOrDefault(c, 0) + 1);
            }
        }

        return charCountMap;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a text or string: ");
        String input = scanner.nextLine();
        scanner.close();
        Map<Character, Integer> charCounts = countCharacters(input);

        System.out.println("Character counts:");
        for (Map.Entry<Character, Integer> entry : charCounts.entrySet()) {
            char character = entry.getKey();
            int count = entry.getValue();
            System.out.println("'" + character + "': " + count);
        }
    }
}
