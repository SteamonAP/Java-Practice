import java.util.*;

public class ElectricityBill {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter units consumed: ");
        int unit = sc.nextInt();

        double bill = 0;

        if (unit <= 50) {
            bill = 0.50 * unit;
        } else if (unit <= 150) {
            bill = 50 * 0.50 + (unit - 50) * 0.75;
        } else if (unit <= 250) {
            bill = 50 * 0.50 + 100 * 0.75 + (unit - 150) * 1.20;
        } else {
            bill = 50 * 0.50 + 100 * 0.75 + 100 * 1.20 + (unit - 250) * 1.50;
        }

        if (bill > 100) {
            bill += bill * 0.20;
        }

        System.out.println("Total Electricity Bill: $" + String.format("%.2f", bill));
        sc.close();

    }
}
