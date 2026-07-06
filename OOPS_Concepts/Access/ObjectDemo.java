package Access;

public class ObjectDemo {

    int num;
    float gpa;

    public ObjectDemo(int num, float gpa) {
        this.num = num;
        this.gpa = gpa;
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return this.gpa == ((ObjectDemo)obj).gpa;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public static void main(String[] args) {
        ObjectDemo obj = new ObjectDemo(45, 56.8f);
        ObjectDemo obj2 = new ObjectDemo(45, 56.8f);
        if (obj == obj2) {
            System.out.println("obj2 is equal than obj");
        }
        if (obj.equals(obj2)) {
            System.out.println("obj2 is equal than obj");
        }

        System.out.println(obj.getClass().hashCode());
        // System.out.println(obj.hashCode());
    }
}
