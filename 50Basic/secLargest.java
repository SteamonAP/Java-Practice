import java.util.*;

public class secLargest {

    public static void main(String[] args) {
        int[] arr = { 12, 35, 1, 10, 34, 1};
        int ans = sLargest(arr);
        System.out.println("The second largest : " + ans);
    }


    public static int sLargest(int[] arr) {
        int n = arr.length;

        int max = arr[0];
        int sMax = Integer.MIN_VALUE;

        for (int i = 0; i < n;i++) {
            if (arr[i] > max){
                sMax = max;
                max = arr[i];
            } else {
                if (arr[i] < max && arr[i] > sMax){
                    sMax = arr[i];
                }
            }
        }
        return sMax;

    }
}
