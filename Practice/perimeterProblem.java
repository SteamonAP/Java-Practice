import java.util.Scanner;

public class perimeterProblem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("╔════════════════════════════════════════════╗");
        System.out.println("║   BASIC JAVA PROGRAMS - DEMONSTRATION     ║");
        System.out.println("╚════════════════════════════════════════════╝\n");

        // Perimeter Calculations
        System.out.println("\n--- PERIMETER CALCULATIONS ---");
        System.out.println("8. Perimeter of Circle (radius=7): " + String.format("%.2f", perimeterOfCircle(7)));
        System.out.println("9. Perimeter of Equilateral Triangle (side=5): " +
                perimeterOfEquilateralTriangle(5));
        System.out.println("10. Perimeter of Parallelogram (side1=8, side2=5): " +
                perimeterOfParallelogram(8, 5));
        System.out.println("11. Perimeter of Rectangle (length=10, width=6): " +
                perimeterOfRectangle(10, 6));
        System.out.println("12. Perimeter of Square (side=7): " + perimeterOfSquare(7));
        System.out.println("13. Perimeter of Rhombus (side=6): " + perimeterOfRhombus(6));
    }

    public static double perimeterOfCircle(double radius) {
        return 2 * Math.PI * radius;
    }

    public static double perimeterOfEquilateralTriangle(double side) {
        return 3 * side;
    }

    public static double perimeterOfParallelogram(double side1, double side2) {
        return 2 * (side1 + side2 );
    }

    public static double perimeterOfRectangle(double length , double width) {
        return 2 * (length + width);
    }

    public static double perimeterOfSquare(double side) {
        return 4 * side;
    }

    public static double perimeterOfRhombus(double side) {
        return 4 * side;
    }
}
