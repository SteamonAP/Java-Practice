import java.util.*;

public class CheckSorted {
    public static void main(String[] args) {
        int[] arr = {1,2,2,4,3,8,9};
        System.out.println(checkSort(arr));    
    }

    static boolean checkSort(int[] arr){
        int n = arr.length;
        int max = Integer.MIN_VALUE;

        for(int i = 0; i < n; i++){
            if(arr[i] >= max){
                max = arr[i];
            }else{
                return false;
            }
        }
        return true;
    }


}
