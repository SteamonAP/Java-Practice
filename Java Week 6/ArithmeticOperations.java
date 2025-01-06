public class ArithmeticOperations {
    public int add(int num1, int num2) {
        return num1 + num2;
    }
    public double add(double num1, double num2) {
        return num1 + num2;
    }
    public int subtract(int num1, int num2) {
        return num1 - num2;
    }
    public double subtract(double num1, double num2) {
        return num1 - num2;
    }
    public int multiply(int num1, int num2) {
        return num1 * num2;
    }
    public double multiply(double num1, double num2) {
        return num1 * num2;
    }
    public int divide(int num1, int num2) {
        if (num2 == 0) {
            throw new ArithmeticException("Division by zero is not allowed.");
        }
        return num1 / num2;
    }
    public double divide(double num1, double num2) {
        if (num2 == 0.0) {
            throw new ArithmeticException("Division by zero is not allowed.");
        }
        return num1 / num2;
    }
    public static void main(String[] args) {
        ArithmeticOperations calculator = new ArithmeticOperations();
        System.out.println("Integer Addition: " + calculator.add(5, 3));
        System.out.println("Double Addition: " + calculator.add(5.5, 3.2));
        System.out.println("Integer Subtraction: " + calculator.subtract(10, 3));
        System.out.println("Double Subtraction: " + calculator.subtract(10.5, 3.2));
        System.out.println("Integer Multiplication: " + calculator.multiply(5, 4));
        System.out.println("Double Multiplication: " + calculator.multiply(5.5, 4.0));
        System.out.println("Integer Division: " + calculator.divide(10, 2));
        System.out.println("Double Division: " + calculator.divide(10.0, 2.0));
    }
}
