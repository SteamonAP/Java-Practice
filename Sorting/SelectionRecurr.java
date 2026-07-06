import java.util.Arrays;

public class SelectionRecurr {
    public static void main(String[] args) {
        int[] arr = { 4, 3, 2, 1 };
        //sort1(arr, 0, 1, 0);
        sort2(arr, arr.length, 0, 0);
        System.out.println(Arrays.toString(arr));
        //System.out.println(Arrays.toString(arr));
    }

    static void sort1(int[] arr, int r, int c, int min) {
        if (r == arr.length - 1) {
            return;
        }

        if (c < arr.length) {
            if (arr[c] < arr[min]) {
                min = c;
            }
            sort1(arr, r, c + 1, min);
        } else {
            int temp = arr[r];
            arr[r] = arr[min];
            arr[min] = temp;

            sort1(arr, r + 1, r + 2, r + 1);
        }
    }

    static void sort2(int[] arr, int r, int c, int max){
        if (r == 0){
            return;
        }
        if(c < r){
            if(arr[c] > arr[max]){
                max = c;
            }
            sort2(arr, r, c+1, max);
        }else{
            int temp = arr[max];
            arr[max] = arr[r-1];
            arr[r-1] = temp;

            sort2(arr, r -1, 0, 0);
        }
    }
}
