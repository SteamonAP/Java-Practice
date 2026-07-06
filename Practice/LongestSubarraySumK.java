import java.util.*;

public class LongestSubarraySumK {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 1, 1, 1, 1 };
        int k = 3;
        System.out.println(longestSubarrayWithSumK(arr, k)); // Output: 3
    }

    public static int longestSubarrayWithSumK(int[] arr, int k){
        int sum = 0;
        int maxLen = 0;
        HashMap<Integer, Integer> prefixMap = new HashMap<>();

        for (int i = 0; i < arr.length; i++){
            sum += arr[i];

            if (sum == k){
                maxLen = Math.max(maxLen, i + 1);
            }

            int rem = sum - k;

            if (prefixMap.containsKey(rem)){
                int len = i - prefixMap.get(rem);
                maxLen = Math.max(maxLen , len);
            }

            prefixMap.putIfAbsent(sum,i);
        }

        return maxLen;


    }
}
