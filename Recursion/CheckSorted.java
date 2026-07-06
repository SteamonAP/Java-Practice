import java.util.*;

public class CheckSorted {
    public static void main(String[] args) {
        int[] arr = {1,2,2,4,4,8,9};
        System.out.println(checkSort(arr));    
    }

    static boolean checkSort(int[] arr){
        if (arr.length <= 1) return true;
        return helper(arr,0);
    }

    static boolean helper(int[] arr, int idx){
        if(idx == arr.length - 1){
            return true;
        }
        if(arr[idx] > arr[idx + 1]){
            return false;
        }

        return helper(arr, idx + 1);
    }


}
