import java.util.Scanner;

public class swapp {


    static class Pair {
        int a,b;
    }
    // static void swap(int[] arr) {
    //     // int temp = arr[0];
    //     // arr[0] = arr[1];
    //     // arr[1] = temp;
    // }
    static void swap(Pair p) {
        int temp = p.a;
        p.a = p.b;
        p.b = temp;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);


        Pair p = new Pair();
        p.a = in.nextInt();
        p.b = in.nextInt();

        swap(p);
        System.out.println("Swapped num : " + p.a + " " + p.b);

        // int arr[] = new int[2];
        // arr[0] = in.nextInt();
        // arr[1] = in.nextInt();
        // swap(arr);
        // System.out.println("Swapped num : " + arr[0] + " " + arr[1]);
    }
}
