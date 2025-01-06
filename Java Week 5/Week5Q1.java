import java.util.Scanner;

public class Week5Q1 {
    public static String getMirrorImage(String input) {
        int length = input.length();
        StringBuilder mirrorImage = new StringBuilder();

        for (int i = length - 1; i >= 0; i--) {
            mirrorImage.append(input.charAt(i));
        }

        return mirrorImage.toString();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();
        String mirrorImage = getMirrorImage(input);

        System.out.println("Mirror Image: " + mirrorImage);

        scanner.close();
    }
}
