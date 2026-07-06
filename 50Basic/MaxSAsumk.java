import java.util.*;

public class MaxSAsumk {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String firstLine = sc.nextLine().trim();
        String[] parts = firstLine.split("\\s+");
        int n = Integer.parseInt(parts[0]);
        int k = Integer.parseInt(parts[1]);

        String arrLine = sc.nextLine().trim();
        String[] arrStr = arrLine.split("[\\s,]+");
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(arrStr[i]);
        }

        int ans = maxSum(arr, k);
        System.out.println(ans);
    }

    public static int maxSum(int[] arr, int k) {

        if (k <= 0 ) return -1;

        int n = arr.length;

        int maxSum = 0;
        int currSum = 0;

        for (int i = 0; i < k; i++) {
            currSum += arr[i];
        }

        maxSum = currSum;
        int s = 0;
        for (int i = k; i < n; i++) {
            currSum += arr[i] - arr[s];
            if (currSum > maxSum) {
                maxSum = currSum;
            }
            s++;
        }

        return maxSum;
        

    }

}
