import java.util.*;

public class maxSumSubarray {

    public static int kadaneMaxSum(int[] nums) {
        int n = nums.length;
        

        int max = Integer.MIN_VALUE;
        int sum = 0;

        for (int i = 0; i < n; i++) {
            sum += nums[i];

            if (sum > max) {
                max = sum;
            }

            if (sum < 0) {
                sum = 0;
            }
        }

        return max;

    }

    public static void kadaneMaxWithSubarray(int[] nums) {
        int max = Integer.MIN_VALUE;
        int sum = 0;
        int n = nums.length;

        int sStart = 0;
        int sEnd = 0;
        int start = 0;

        for (int i = 0; i < n; i++) {
            if (sum == 0) {
                start = i;
            }
            sum += nums[i];

            if (sum > max) {
                max = sum;
                sStart = start;
                sEnd = i;
            }

            if (sum < 0) {
                sum = 0;
            }
        }

        System.out.println("Max Sum = " + max);
        System.out.print("Subarray: ");

        for (int i = sStart; i <= sEnd; i++) {
            System.out.print(nums[i] + " ");
        }
    }

    public static int[] kadaneMinWithSubarray(int[] nums ) {
        int n = nums.length;
        int sum = 0;
        int min = Integer.MAX_VALUE;

        int start = 0;
        int sStart = 0;
        int sEnd = 0;


        for (int i = 0; i < n; i++) {

            if (sum == 0) {
                start = i;
            }
            sum += nums[i];

            if (sum < min) {
                min = sum;
                sStart = start;
                sEnd = i;
            }

            if (sum > 0) {
                sum = 0;
            }
        }

        int[] result = new int[sEnd - sStart + 1];

        for (int i = sStart; i <= sEnd; i++) {
            result[i - sStart] = nums[i];
        }

        return result;
    }

    public static int kadaneMinSum(int[] nums) {
        int n = nums.length;
        int min = Integer.MAX_VALUE;
        int sum = 0;

        for (int i = 0; i < n; i++) {
            sum += nums[i];

            if (sum < min) {
                min = sum;
            }

            if (sum > 0) {
                sum = 0;
            }

        }
        return min;
    }
}
