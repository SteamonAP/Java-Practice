import java.util.*;

public class MaxProfitGreedy {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine().trim());
        int[] arr = new int[n];

        String arrLine = sc.nextLine().trim();
        arrLine = arrLine.replaceAll("[\\[\\]{}()]", "");
        String[] vals = arrLine.split("[\\s,]+");

        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(vals[i]);
        }

        // Brute Force

        // int max = 0;

        // for (int i = 0; i < n; i++){
        // int count = 0;
        // for(int j = i + 1; j < n;j++){
        // count = arr[j] - arr[i];
        // if (count > max){
        // max = count;
        // }
        // }

        // }

        // if (max < 0){
        // System.out.print(0);
        // }else {
        // System.out.print(max);
        // }

        /// Optimal

        int min = arr[0];
        int maxP = 0;
        for (int i = 1; i < n; i++) {
            min = Math.min(min, arr[i]);
            int p = arr[i] - min;
            maxP = Math.max(maxP, p);
        }

        if (maxP < 0) {
            System.out.print(0);
        } else {
            System.out.print(maxP);
        }

    }
}