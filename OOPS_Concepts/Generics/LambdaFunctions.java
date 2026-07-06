import java.util.ArrayList;
import java.util.function.Consumer;

public class LambdaFunctions {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            arr.add(i + 1);
        }

        // arr.forEach((item) -> {
        // System.out.println(item * 2);
        // });
        // Consumer<Integer> fun = ((item) -> {
        //     System.out.println(item * 2);
        // });
        // arr.forEach(fun);

        Operation sum = (a, b) -> a + b;
        Operation prod = (a, b) -> a * b;
        Operation sub = (a, b) -> a - b;

        LambdaFunctions foo = new LambdaFunctions();
        System.out.println(foo.operate(5, 3, sub));
        System.out.println(foo.operate(5, 3, sum));
        System.out.println(foo.operate(5, 3, prod));

    }

    // int sum(int a, int b) {
    // return a + b;
    // }

    private int operate(int a, int b, Operation op) {
        return op.opt(a, b);
    }
}

interface Operation {
    int opt(int a, int b);
}
