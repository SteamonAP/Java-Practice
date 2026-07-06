import java.util.*;

public class MaximumSumRectangle {

    public static int maxSumRectangle(int R, int C, int[][] M) {
        int[] sum = new int[R];

        int maxSum = Integer.MIN_VALUE;

        for (int cStart = 0; cStart < C; cStart++) {
            Arrays.fill(sum, 0);
            for (int cEnd = cStart; cEnd < C; cEnd++) {
                for (int row = 0; row < R; row++) {
                    sum[row] += M[row][cEnd];
                }
                int currMax = kadane(sum);
                maxSum = Math.max(maxSum, currMax);
            }
        }
        return maxSum;

    }

    public static int kadane(int[] arr) {
        int n = arr.length;

        int maxSum = Integer.MIN_VALUE;
        int sum = 0;

        int ansStart = -1;
        int ansEnd = -1;

        for (int i = 0; i < n; i++) {
            int start = 0;
            if (sum == 0){
                start = i;
            }
            sum += arr[i];

            if (sum > maxSum) {
                maxSum = sum;
                ansStart = start;
                ansEnd = i;
            }

            if (sum < 0) {
                sum = 0;
            }

        }
        return maxSum;
    }

}
