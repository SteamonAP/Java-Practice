import java.util.Scanner;
public class Week5Q2 {
    public static boolean areRotationallyEquivalent(String str1, String str2) {
        if (str1.length() != str2.length()) {
            return false;
        }
        String concatenatedStr = str1 + str1;
        if (concatenatedStr.contains(str2)) {
            return true;
        }

        return false;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the first string: ");
        String str1 = scanner.nextLine();
        System.out.print("Enter the second string: ");
        String str2 = scanner.nextLine();
        boolean areEquivalent = areRotationallyEquivalent(str1, str2);
        System.out.println("Are two strings Rotationally equal? : " + areEquivalent);
        scanner.close();
    }
}
