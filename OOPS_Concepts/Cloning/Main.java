package Cloning;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        Human amogh = new Human(21, "Amogh");
        // Human twin = new Human(amogh);

        Human twin = (Human) amogh.clone();
        System.out.println(twin.age + " " + twin.name);
        System.out.println(Arrays.toString(twin.arr));

        twin.arr[0] = 100;
        System.out.println(Arrays.toString(amogh.arr));
        System.out.println(Arrays.toString(twin.arr));
    }
}
