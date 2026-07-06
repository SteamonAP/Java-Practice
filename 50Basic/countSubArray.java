import java.util.*;


public class countSubArray {
    public static void main(String[] args) {

        int[] nums = { 1, 2, 3, -1, 1, 1, 1, 4, 2, -3 };
        int sol = countSubarray(nums, 3);
        
        System.out.println("Count subarray length with hash = " + sol);
    }


    public static int countSubarray(int[] nums, int k) {
        Map<Integer,Integer> mpp = new HashMap<>();

        mpp.put(0,1);

        int n = nums.length;
        int count = 0;
        int sum = 0;

        for (int i = 0; i < n; i++) {
            sum += nums[i];

            int rem = sum - k;

            if (mpp.containsKey(rem)) {
                count += mpp.get(rem);
            }

            mpp.put(sum , mpp.getOrDefault(sum, 0) + 1);
        }

        return count;   
    }
}
