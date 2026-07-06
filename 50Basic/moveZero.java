import java.util.*;

public class moveZero {

    public static void main(String[] args) {
        int[] arr = { 0, 1, 0, 3, 12 };
        zeroEnd(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void zeroEnd(int[] arr) {
        int n = arr.length;
        // List<Integer> result = new ArrayList<>();

        // for (int i = 0; i < n;i++){
        // if (arr[i] != 0){
        // result.add(arr[i]);
        // }
        // }

        // for(int i = 0; i < n;i++) {
        // if (arr[i] == 0) {
        // result.add(arr[i]);
        // }
        // }

        // for (int i = 0; i < n;i++){
        // arr[i] = result.get(i);
        // }
        int j = -1;
        for (int i = 0; i < n;i++){
            if (arr[i] == 0){
                j = i;
                break;
            }
        }

        for (int i = j + 1; i < n;i++){
            if (arr[i] !=0) {
                swap(arr, i, j);
                j++;
            }
        }

    }

    public static void swap(int[] arr, int a1, int a2) {
        int temp = arr[a1];
        arr[a1] = arr[a2];
        arr[a2] = temp;
    }

}
