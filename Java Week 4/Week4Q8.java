import java.util.Scanner;

public class Week4Q8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the name of a month: ");
        String monthName = scanner.nextLine();
        scanner.close();

        int days = getDaysInMonth(monthName);

        if (days != -1) {
            System.out.println("Number of days in " + monthName + ": " + days);
        } else {
            System.out.println("Invalid month name.");
        }
    }

    public static int getDaysInMonth(String monthName) {
        switch (monthName.toLowerCase()) {
            case "january":
            case "march":
            case "may":
            case "july":
            case "august":
            case "october":
            case "december":
                return 31;

            case "april":
            case "june":
            case "september":
            case "november":
                return 30;

            case "february":
                return 28;

            default:
                return -1;
        }
    }
}
