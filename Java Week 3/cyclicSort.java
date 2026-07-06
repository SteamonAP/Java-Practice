import java.util.*;

public class cyclicSort {
    public static void main(String[] args) {
        int[] arr = { 4,3,7,1,2 };
        cyclic(arr);
        System.out.println(Arrays.toString(arr));

    }

    static void cyclic(int[] arr) {

        int n = arr.length;

        int i = 0;
        while (i < n) {
            int correct = arr[i] - 1;
            if (arr[i] != arr[correct]) {
                swap(arr, i, correct);
            } else {
                i++;
            }
        }

    }

    static void swap(int[] var0, int var1, int var2) {
        int var3 = var0[var1];
        var0[var1] = var0[var2];
        var0[var2] = var3;
    }
}
