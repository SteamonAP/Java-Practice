import java.util.*;

public class minMaxSubarrays {
    public static void main(String[] args) {
        int[] arr = {1, 3, -1, -3, 5, 3, 6, 7};
        int k = 3;

        minMaxSubarrays(arr, k);
    }

    public static void minMaxSubarrays(int[] arr, int k){
        int n = arr.length;

        for(int i = 0 ; i <= n-k; i++){
            int min = arr[i];
            int max = arr[i];

            for(int j = 0; j < i + k;j++){
                min = Math.min(min,arr[j]);
                max = Math.max(max,arr[j]);
            }

            System.out.print("(" + min + "," + max + ")");


        }
    }
}
