import java.util.*;

public class DepreciationCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double initialValue = sc.nextDouble();

        double rate = sc.nextDouble();

        int years = sc.nextInt();

        double annualDepreciation = initialValue * (rate / 100);
        double totalDepreciation = annualDepreciation * years;
        double curretValue = initialValue - totalDepreciation;

        System.out.println("\n--- DEPRECIATION REPORT ---");
        System.out.println("Initial Value: $" + initialValue);
        System.out.println("Annual Depreciation: $" + String.format("%.2f", annualDepreciation));
        System.out.println("Total Depreciation: $" + String.format("%.2f", totalDepreciation));
        System.out.println("Current Value: $" + String.format("%.2f", curretValue));

        sc.close();

    }
}
