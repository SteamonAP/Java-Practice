import java.util.Scanner;

public class Week4Q4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a word: ");
        String inputWord = scanner.nextLine();

        char[] charArray = inputWord.toCharArray();

        int start = 0;
        int end = charArray.length - 1;
        while (start < end) {

            char temp = charArray[start];
            charArray[start] = charArray[end];
            charArray[end] = temp;

            start++;
            end--;
        }

        String reversedWord = new String(charArray);

        System.out.println("Reversed word: " + reversedWord);

        scanner.close();
    }

}
