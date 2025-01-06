import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class Week4Q6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input your password: ");
        String password = scanner.nextLine();
        scanner.close();

        if (isValidPassword(password)) {
            System.out.println("Valid Password");
        } else {
            System.out.println("Not a Valid Password");
        }
    }

    public static boolean isValidPassword(String password) {

        if (password.length() < 6 || password.length() > 16) {
            return false;
        }

        if (!Pattern.compile("^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d).+$").matcher(password).matches()) {
            return false;
        }

        if (!Pattern.compile("^(?=.*[$#@]).+$").matcher(password).matches()) {
            return false;
        }

        return true;
    }
}
