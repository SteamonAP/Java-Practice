import add.plus;
import sub.minus;

public class calculator {
    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 5;

        int sum = plus.add(num1, num2);
        System.out.println("Sum: " + sum);

        int difference = minus.subtract(num1, num2);
        System.out.println("Difference: " + difference);
    }
}
