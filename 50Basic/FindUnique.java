import java.util.*;

public class FindUnique {
    // public static void main(String[] args) {
    // int[] arr = {2,3,2,4,4,6,6,5,7,5,7};
    // System.out.println(ans(arr));
    // }

    // public static int ans(int[] arr){
    // int count = 0;

    // for (int n : arr){
    // count ^= n;
    // }

    // return count;
    // }

    public static void main(String[] args) {
        int[] arr = { 2, 2, 3, 2, 7, 7, 8, 7, 8, 8 };
        System.out.println(ans(arr));
    }

    public static int ans(int[] arr) {
        int result = 0;

        for (int i = 0; i < 32; i++){
            int sum = 0;

            for (int num : arr){
                if (((num >> i) & 1) == 1){
                    sum++;
                }
            }
            if (sum % 3 != 0){
                result |= (1 << i);
            }
        }

        return result;
    }
}
