package AbstractDemo;

public class Daughter extends Parent {

    public Daughter(int age){
        super(age);
    }

    @Override
    void career(String name) {
        System.out.println("I'll be a " + name + " one day!!");
    }

    @Override
    void partner(String name, int age) {
        System.out.println("I like " + name + " and he is " + age + " years old");
    }
}
