import java.util.Arrays;
import java.util.Scanner;

public class reverse {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter size: ");
        int n = in.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter array: ");

        for (int i = 0; i < arr.length; i++) {
            arr[i] = in.nextInt();
        }
        rev(arr);
        System.out.println("The array: " + Arrays.toString(arr) );

    }

    static void rev (int[] arr) {
        int s = 0;
        int e = arr.length - 1; 
        while (s < e) {
            swap(arr, s, e);
            s++;
            e--;
        }

    }

    static void swap(int[] arr,  int num1, int num2) {
        int temp = arr[num1];
        arr[num1] = arr[num2];
        arr[num2] = temp;
    }
}
