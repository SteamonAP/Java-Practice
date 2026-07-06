package ExceptionHandling;

public class Main {
    public static void main(String[] args) {
        int a = 10;
        int b = 0;
        try {
            // int c = divide(a, b);
            // System.out.println(c);
            // throw new Exception("just for fun");
            String name = "Amogh";
            if (name.equals("Amogh")) {
                throw new MyException("name is amogh");
            }
        } catch (MyException e) {
            System.out.println(e.getMessage());
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        } catch (Exception e) {
            System.out.println("The error occured :- " + e.getMessage());
        } finally {
            System.out.println("THis is always execute");
        }
    }

    static int divide(int a, int b) throws ArithmeticException {// 'throws' declares that this method may throw this exception.
                                                                // The actual exception is thrown using the 'throw' keyword.
        if (b == 0) {
            throw new ArithmeticException("Aah , can't divide by zero man!! ");
        }
        return a / b;
    }
}
