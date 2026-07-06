package Polymorphism;

public class Main {
    public static void main(String[] args) {
        Shapes shape = new Shapes();
        Shapes circle = new Circle();
        Square sq = new Square();
        Triangle tri = new Triangle();

        // shape.area();
        circle.area();
        // sq.area();
        // tri.area();
    }
}
