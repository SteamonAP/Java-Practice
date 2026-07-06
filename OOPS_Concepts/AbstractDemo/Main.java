package AbstractDemo;

public class Main {
    public static void main(String[] args) {
        Son son = new Son(21);
        // son.career(" Lawyer ");
        // son.partner(" Anushka ", 23);
        System.out.println("sons age : " + son.age);

        Daughter daughter = new Daughter(23);
        // daughter.career(" Doctor ");
        // daughter.partner(" Arjun ", 21);
        System.out.println("Daughter's age : " + daughter.age);

        Parent.hello();
        Parent p = new Son(21);
        p.normal();
    }
}
