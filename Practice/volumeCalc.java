import java.util.Scanner;

public class volumeCalc {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("╔════════════════════════════════════════════╗");
        System.out.println("║   BASIC JAVA PROGRAMS - DEMONSTRATION     ║");
        System.out.println("╚════════════════════════════════════════════╝\n");

        // Volume Calculations
        System.out.println("\n--- VOLUME CALCULATIONS ---");
        System.out.println("14. Volume of Cone (radius=3, height=7): " +
                String.format("%.2f", volumeOfCone(3, 7)));
        System.out.println("15. Volume of Prism (baseArea=20, height=10): " + volumeOfPrism(20, 10));
        System.out.println("16. Volume of Cylinder (radius=4, height=10): " +
                String.format("%.2f", volumeOfCylinder(4, 10)));
        System.out.println("17. Volume of Sphere (radius=5): " +
                String.format("%.2f", volumeOfSphere(5)));
        System.out.println("18. Volume of Pyramid (baseArea=25, height=9): " +
                String.format("%.2f", volumeOfPyramid(25, 9)));

        // Surface Area Calculations
        System.out.println("\n--- SURFACE AREA CALCULATIONS ---");
        System.out.println("19. Curved Surface Area of Cylinder (radius=3, height=8): " +
                String.format("%.2f", curvedSurfaceAreaOfCylinder(3, 8)));
        System.out.println("20. Total Surface Area of Cube (side=4): " +
                totalSurfaceAreaOfCube(4));
    }

    public static double volumeOfCone(double radius, double height) {
        return (1.0/3.0) * Math.PI * radius * radius * height;
    }

    public static double volumeOfPrism(double baseArea, double height) {
        return baseArea * height;
    }

    public static double volumeOfCylinder(double radius, double height) {
        return Math.PI * radius * radius * height;
    }

    public static double volumeOfSphere(double radius) {
        return ( 4.0 / 3.0 ) * Math.PI * radius * radius * radius;
    }

    public static double volumeOfPyramid(double baseArea, double height) {
        return (1.0/3.0) * baseArea * height;
    }

    public static double curvedSurfaceAreaOfCylinder(double radius, double height) {
        return 2 * Math.PI * radius * height;
    }

    public static double totalSurfaceAreaOfCube(double side) {
        return 6 * side * side;
    }

}
