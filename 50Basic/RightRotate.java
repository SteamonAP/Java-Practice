import java.util.*;

public class RightRotate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine().trim());

        if (n == 0) {
            return;
        }

        int[] arr = new int[n];

        String arrLine = sc.nextLine().trim();
        arrLine = arrLine.replaceAll("[\\[\\]]", "");
        String[] vals = arrLine.split("[\\s,]+");

        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(vals[i]);
        }

        int k = Integer.parseInt(sc.nextLine().trim());

        // k = k % n;
        //or
        k = ((k % n) + n) % n;

        // int[] temp = new int[n];

        // for (int i = 0; i < n; i++) {
        // temp[(i + k) % n] = arr[i];
        // }

        // for (int i = 0 ; i < n; i ++) {
        // System.out.print(temp[i] + " ");
        // }

        reverse(arr, 0, n - 1);
        reverse(arr, 0, k - 1);
        reverse(arr, k, n - 1);

        for (int i = 0; i < n; i++) {

            System.out.print(arr[i] + " ");
        }

        sc.close();
    }

    public static void reverse(int[] arr, int s, int e) {
        while (s < e) {
            int temp = arr[s];
            arr[s] = arr[e];
            arr[e] = temp;
            s++;
            e--;
        }
    }

}
