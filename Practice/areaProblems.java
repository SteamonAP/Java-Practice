import java.util.Scanner;

public class areaProblems {

    public static double areaOfCircle(double r) {
        return Math.PI * r * r;
    }

    public static double areaOfTriangle(double base, double height) {
        return 0.5 * base * height;
    }

    public static double areaOfRectangle(double length, double width) {
        return length * width;
    }

    public static double areaOfIsoscelesTriangle(double base, double equalSide) {
        double height = Math.sqrt(equalSide * equalSide - (base * base / 4));
        return 0.5 * base * height;
    }

    public static double areaOfParallelogram(double base, double height) {
        return base * height;
    }

    public static double areaOfRhombus(double d1, double d2) {
        return 0.5 * d1 * d2;
    }

    public static double areaOfEquilateralTriangle(double side) {
        return (Math.sqrt(3) / 4) * side * side;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("╔════════════════════════════════════════════╗");
        System.out.println("║   BASIC JAVA PROGRAMS - DEMONSTRATION     ║");
        System.out.println("╚════════════════════════════════════════════╝\n");

        // Area Calculations
        System.out.println("--- AREA CALCULATIONS ---");
        System.out.println("1. Area of Circle (radius=5): " + String.format("%.2f", areaOfCircle(5)));
        System.out.println("2. Area of Triangle (base=10, height=6): " + areaOfTriangle(10, 6));
        System.out.println("3. Area of Rectangle (length=8, width=5): " + areaOfRectangle(8, 5));
        System.out.println("4. Area of Isosceles Triangle (base=6, equalSide=5): " +
                String.format("%.2f", areaOfIsoscelesTriangle(6, 5)));
        System.out.println("5. Area of Parallelogram (base=10, height=7): " + areaOfParallelogram(10, 7));
        System.out.println("6. Area of Rhombus (d1=8, d2=6): " + areaOfRhombus(8, 6));
        System.out.println("7. Area of Equilateral Triangle (side=6): " +
                String.format("%.2f", areaOfEquilateralTriangle(6)));
    }

}
