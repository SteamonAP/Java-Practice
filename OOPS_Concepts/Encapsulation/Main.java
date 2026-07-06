package Encapsulation;

public class Main {
    public static void main(String[] args) {
        A obj = new A(10, "Amogh");

        // System.out.println(obj.num);
        System.out.println(obj.getNum());
        obj.setNum(20);
        System.out.println(obj.getNum());

    }

}
