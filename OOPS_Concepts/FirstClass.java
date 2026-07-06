import java.util.*;

public class FirstClass {
    public static void main(String[] args) {

        // Junior amogh = new Junior(22, "Amogh", 22.5f);
        // System.out.println(amogh.getRno());
        // System.out.println(amogh.getName());
        // System.out.println(amogh.getMarks());

        // amogh.changeName("Pitale");

        // System.out.println("The changed name : " + amogh.getName());

        // Junior random = new Junior();
        // System.out.println(random.getRno());
        // System.out.println(random.getName());
        // System.out.println(random.getMarks());
    }

    // class

}

// class for all student
class Junior {
    private int rno;
    private String name;
    private float marks;

    // Constructor defines what happens when an Object is being created!
    public Junior(int rno, String name, float marks) {
        this.rno = rno;
        this.name = name;
        this.marks = marks;
    }

    Junior() {
        // this is how to call a constructor from another constructor
        // internally : new Student(13, "arjun",100.0f)
        this(13, "arjun", 100.0f);
    }

    public int getRno() {
        return rno;
    }

    public String getName() {
        return name;
    }

    public float getMarks() {
        return marks;
    }

    void changeName(String newName) {
        this.name = newName;
    }
}
