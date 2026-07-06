import java.util.*;

public class simpleInterest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input values
        System.out.print("Enter Principal: ");
        double principal = sc.nextDouble();

        System.out.print("Enter Time (in years): ");
        double time = sc.nextDouble();

        System.out.print("Enter Rate of Interest: ");
        double rate = sc.nextDouble();

        double simpleInterest = (principal * time * rate) / 100;
        System.out.println("Simple Interest = " + simpleInterest);

        double amount = principal * Math.pow((1 + rate / 100) , time);
        double compoundInterest = amount - principal;
        System.out.println("Compound Interest = " + compoundInterest);

        sc.close();
    }    
}
