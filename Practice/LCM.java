import java.util.*;

public class LCM {
    //GCD = gcd(rem(b,a),a)
    //HCF and GCD are one and the same

    public static int findHcf(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    public static int findLcm(int a, int b) {
        // return (a * b) / findHcf(a, b);
        return (a * b) / findGCD(a, b);
    }

    // public static int findGCD(int a, int b){
    //     return (a*b) / findLcm(a, b);
    // }
    public static int findGCD(int a, int b){
        if (a==0){
            return b;
        }
        return findGCD(b%a,a);
    }



    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter first number: ");
        int num1 = scanner.nextInt();
        
        System.out.print("Enter second number: ");
        int num2 = scanner.nextInt();
        
        int lcm = findLcm(num1, num2);
        int hcf = findHcf(num1, num2);
        int gcd = findGCD(num1, num2);
        
        System.out.println("HCF of " + num1 + " and " + num2 + " = " + hcf);
        System.out.println("LCM of " + num1 + " and " + num2 + " = " + lcm);
        System.out.println("GCD of " + num1 + " and " + num2 + " = " + gcd);

        scanner.close();
    }

    
    
}
