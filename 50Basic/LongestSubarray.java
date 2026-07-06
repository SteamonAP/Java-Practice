import java.util.*;

public class LongestSubarray {

    // public static int subarraySum(int[] nums, int k) {
    //     int n = nums.length;
    //     int maxLen = 0;

    //     for (int i = 0; i < n; i++) {
    //         int sum = 0;
    //         for (int j = i; j < n; j++) {
    //             sum += nums[j];
    //             if (sum == k) {
    //                 maxLen = Math.max(maxLen, j - i + 1);
    //             }
    //         }
    //     }

    //     return maxLen;
    // }



    //Optimal
    public static int subarraySum(int[] nums, int k){
        int n = nums.length;
        int maxLen = 0;
        int i = 0;
        int j = 0;

        int sum = nums[0];


        while (i < n) {
            while (j <= i && sum > k){
                sum -= nums[j];
                j++;
            }
            if (sum == k) {
                maxLen = Math.max(maxLen, i - j + 1);
            }
            i++;
            if (i < n) {
                sum += nums[i];
            }
        }

        return maxLen;
    }




    public static int subarraySumforNegatives(int[] nums, int k) {
        Map<Long,Integer> map = new HashMap<>();
        long sum = 0;
        int maxLen = 0;

        int n = nums.length;

        for (int i = 0; i < n; i++){
            sum += nums[i];
            if (sum == k) {
                maxLen = i + 1;
            }

            long rem = sum - k;

            if (map.containsKey(rem)) {
                maxLen = Math.max(maxLen, i - map.get(rem));
            }

            map.putIfAbsent(sum, i);

        }
        return maxLen;
    }
    public static void main(String[] args) {

        int[] nums = { 1, 2, 3, 1, 1, 1, 1 };
        int[] nums2 = { 2,0,0,0,3 };
        int k = 3;

        int result = subarraySum(nums, k);
        int sol = subarraySumforNegatives(nums2, k);

        System.out.println("Longest subarray length = " + result);
        System.out.println("Longest subarray length with hash = " + sol);
    }
}
