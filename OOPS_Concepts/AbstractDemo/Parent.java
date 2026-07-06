package AbstractDemo;

public abstract class Parent {
    int age;
    final int value;
    public Parent(int age){
        this.age = age;
        value = 340;
    }
    abstract void career(String name);

    static void hello(){
        System.out.println("hello!!");
    }
    void normal(){
        System.out.println("IM COMPLETELY NORMAL WITH THIS!");
    }
    abstract void partner(String name, int age);
}
