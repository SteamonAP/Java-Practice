abstract class Animal {
    abstract void walk();
    Animal(){
        System.out.println("You are a new ANimal now");
    }
    public void eats(){
        System.out.println("Animal eats");
    }
}

class Horse extends Animal {
    Horse() {
        System.out.println("Created a horse");
    }
    public void walk(){
        System.out.println("Walks on 4 legs");
    }
}

class Chicken extends Animal {
    public void walk() {
        System.out.println("Walks on 2 legs");
    }
}

public class Abstraction {
    public static void main(String[] args) {
        Horse horse = new Horse();
        horse.walk();
    }
}

// Interfaces
// interface Animal {
//     int eyes = 2;
//     void walk();
// }

// interface Herbivore {

// }
// //Multiple inheritence one sub class inheriting from 2 base classes, \
// //only be done through Interfaces in java
// class Horse implements Animal, Herbivore {
//     public void walk(){
//         System.out.println("walks on 4 legs");
//     }
// }
