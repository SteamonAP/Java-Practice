import java.util.Arrays;

public class Insersion {
    public static void main(String[] args) {
        int[] arr = { 13, 46, 24, 52, 20, 9 };
        sort(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void sort(int[] arr) {
        int n = arr.length;
        for(int i = 0; i < n; i++){
            int j = i;
            while(j > 0 && arr[j-1] > arr[j]){
                swap(arr, j-1, j);
                j--;
            }
        }
    }

    public static void swap(int[] arr, int a, int b) {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
}
