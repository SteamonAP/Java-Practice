import java.util.*;

public class findLengthOfLCIS {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int currLen = 1, maxLen = 1;
        int currStart = 0, maxStart = 0;

        for (int i = 1; i < n; i++){
            if (arr[i] > arr[i-1]) {
                currLen++;
            } else {
                if (currLen > maxLen) {
                    maxLen = currLen;
                    maxStart = currStart;
                }
                currLen = 1;
                currStart = i;
            }
        }
        if (currLen > maxLen) {
            maxLen = currLen;
            maxStart = currStart;
        }

        for (int i = maxStart; i < maxStart + maxLen; i++) {
            System.out.print(arr[i]);
            if (i < maxStart + maxLen - 1) System.out.print(" ");
        }
        System.out.println();
        sc.close();
    }

}
