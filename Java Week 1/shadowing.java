import java.lang.reflect.Array;
import java.util.Arrays;

public class shadowing {
    static int x = 100; //Since we can't use object dependent things like the head class in object indipendent
                    //thing like psvm so add static
    public static void main(String[] args) {

        System.out.println(x);
        fun(1,2,3,4,5,6,7,8,8);
        fun("AMogh");

        mul(5, 6, "amogh", "steamon");
    }

    static void mul(int a, int b, String ...v){

    }

    static void fun(int ...v){
        System.out.println("first");
        System.out.println(Arrays.toString(v));
    }
    static void fun(String ...v){
        System.out.println("second");
        System.out.println(Arrays.toString(v));
    }
}
