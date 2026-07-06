package Inheritence;
import java.util.*;

import Shape;
import Bank.*;

public class Inheritance {
    // public static void main(String[] args) {
    // Triangle t1 = new Triangle();
    // t1.color = "Red";
    // }

    // public static void main(String[] args) {
    //     bank.Account acc1 = new Bank.Account();
    // }
}

// base class
class Shape {
    String color;

    public void area() {
        System.out.println("Displays area: ");
    }
}

// sub or child class
class Triangle extends Shape {
    public void area(int l, int h) {
        System.out.println(1 / 2 * l * h);
    }
}

class Circle extends Shape {
    public void area(int r) {
        System.out.println((3.14) * r * r);
    }
}

class EquilateralTriangle extends Triangle {
    public void area(int l, int h) {
        System.out.println(1 / 2 * l * h);
    }
}
