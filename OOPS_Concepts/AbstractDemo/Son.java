package AbstractDemo;

public class Son extends Parent {

    public Son(int age){
        super(age);
    }

    @Override
    void career(String name) {
        System.out.println(" I'll be a " + name + " one day!!");
    }

    @Override
    void normal(){
        System.out.println("Yea this is Son's normal!!");
    }

    @Override
    void partner(String name, int age) {
        System.out.println(" I like " + name + " and she is " + age + " years old");
    }
}
