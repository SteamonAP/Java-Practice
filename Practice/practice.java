import java.io.*;

interface In1 {
    int a = 10;

    void display();
}

class practice implements In1 {
    public void display() {
        System.out.println("Steamon");

    }

    public static void main(String[] args) {
        practice p = new practice();
        p.display();
        System.out.println(a);
    }
}