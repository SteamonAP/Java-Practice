public class StaticBlock {
    // static int a = 4;
    // static int b;

    // will only run once, when the first object is created , that is when the class
    // is loaded for the first time
    // static {
    // System.out.println("Inside static block");
    // b = a * 5;
    // }

    // static class Test{
    // String name;

    // public Test(String name) {
    // this.name = name;
    // }
    // }

    public static void main(String[] args) {
        // StaticBlock obj = new StaticBlock();
        // System.out.println(obj.a + " " + obj.b);

        // obj.b += 3;
        // System.out.println(obj.b);

        // StaticBlock obj2 = new StaticBlock();
        // System.out.println(obj2.b + " " + obj2.a);

        Test a = new Test("Amogh");
        Test b = new Test("Sumant");

        System.out.println(a.name);
        System.out.println(b.name);

    }
}

class Test {
    static String name;

    public Test(String name) {
        this.name = name;
    }
}
