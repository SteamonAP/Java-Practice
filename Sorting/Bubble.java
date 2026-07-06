import java.util.*;

public class Bubble {
    public static void main(String[] args) {
        int[] arr = { 13, 46, 24, 52, 20, 9 };
        sort(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void sort(int[] arr) {
        int n = arr.length;
        for (int i = n - 1; i >= 1; i--) {
            int didSwap = 0;
            for (int j = 0; j < i; j++) {
                if (arr[j] > arr[j + 1]) {

                    swap(arr, j, j + 1);
                    didSwap = 1;
                }
            }
            if(didSwap == 0){
                break;
            }
        }
    }

    public static void swap(int[] arr, int a, int b) {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
}
