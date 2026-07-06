
class Pen {
    String color;
    String type;

    public void write(){
        System.out.println("Writing....");
    }

    public void printColor(){
        System.out.println(this.color);
    }
}

class Student {
    String name;
    int age;

    // public void printInfo(){
    //     System.out.println(this.name);
    //     System.out.println(this.age);
    // }

    // //Constructor
    // Student(Student s2) {
    //     this.name = s2.name;
    //     this.age = s2.age;
    // }

    // Student() {}



    //Overloading

    public void printInfo(String name) {
        System.out.println(name);
    }

    public void printInfo(int age){
        System.out.println(age);
    }

    public void printInfo(String name, int age) {
        System.out.println(name + " " + age);
    }
}

public class OneShot {
    public static void main(String[] args) {
        // Pen pen1 = new Pen();
        // pen1.color = "blue";
        // pen1.type = "gel";

        // Pen pen2 = new Pen();
        // pen2.color = "black";
        // pen2.type = "ballpoint";


        // pen1.printColor();
        // pen2.printColor();

        Student s1 = new Student();
        s1.name = "AMogh";
        s1.age = 21;

        s1.printInfo(s1.name , s1.age);
    }
}



