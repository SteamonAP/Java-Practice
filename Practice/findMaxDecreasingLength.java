import java.util.*;

public class findMaxDecreasingLength {
    public static int mySol(List<Integer> nums) {
        if (nums == null || nums.size() == 0)
            return 0;
        if (nums.size() == 1)
            return 1;

        int n = nums.size();
        int s = 0;
        int e = 1;
        int length = 1;

        List<Integer> maxi = new ArrayList<>();

        while (e < n) {
            if (nums.get(s) >= nums.get(e)) {
                length += 1;
            } else {
                maxi.add(length);
                length = 1;
            }

            s++;
            e++;
        }
        maxi.add(length);

        int[] res = new int[maxi.size()];
        for (int i = 0; i < res.length; i++) {
            res[i] = maxi.get(i);
        }

        int great = res[0];
        for (int i = 0; i < res.length; i++) {
            if (res[i] > great) {

            }
        }

        int ans = Collections.max(maxi);
        // return great;
        return ans;
    }

    public static int offSol(int N, List<Integer> nums) {
        if (nums == null || nums.size() == 0) {
            return 0;
        }
        if (nums.size() == 1) {
            return 1;
        }

        int currLen = 1;
        int maxLen = 1;


        for ( int i = 0; i < nums.size(); i++) {
            if (nums.get(i) <= nums.get(i-1)) {
                currLen++;
            } else {
                currLen = 1;
            }

            maxLen = Math.max(maxLen, currLen);
        }

        return maxLen;
    }

    public static void main(String[] args) {
        // Test with your example
        List<Integer> nums = Arrays.asList(19, 93, 87, 90, 72, 72, 5, 39, 95);

        System.out.println("Array: " + nums);
        System.out.println("Maximum decreasing subarray length: " + mySol(nums));

        // Let's trace through it
        System.out.println("\n--- Step by Step Trace ---");
        traceExecution(nums);
    }

    // Helper method to show execution step by step
    public static void traceExecution(List<Integer> nums) {
        int maxLength = 1;
        int currentLength = 1;

        System.out.println("Index | Value | Comparison | Current Length | Max Length");
        System.out.println("------|-------|------------|----------------|------------");
        System.out.printf("  0   |  %2d   |     -      |       1        |     1\n",
                nums.get(0));

        for (int i = 1; i < nums.size(); i++) {
            String comparison;
            if (nums.get(i) <= nums.get(i - 1)) {
                currentLength++;
                comparison = nums.get(i) + " <= " + nums.get(i - 1) + " ✓";
            } else {
                currentLength = 1;
                comparison = nums.get(i) + " > " + nums.get(i - 1) + " ✗";
            }

            maxLength = Math.max(maxLength, currentLength);

            System.out.printf("  %d   |  %2d   | %s |       %d        |     %d\n",
                    i, nums.get(i), comparison, currentLength, maxLength);
        }
    }
}
