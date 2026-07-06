import java.util.*;

public class LeftRotate {
    public static void main(String[] args) {

        // Brute force:
        // Scanner sc = new Scanner(System.in);
        // String firstLine = sc.nextLine().trim();
        // String[] parts = firstLine.split("\\s+");
        // int n = Integer.parseInt(parts[0]);

        // int[] arr = new int[n];
        // String arrLine = sc.nextLine().trim();
        // String[] vals = arrLine.split("[\\s,]+");
        // for (int i = 0; i < n; i++) {

        // arr[i] = Integer.parseInt(vals[i]);
        // }

        // String trdLine = sc.nextLine().trim();
        // String[] part = trdLine.split("\\s+");

        // int d = Integer.parseInt(part[0]);

        // d = d % n; // for large d vals

        // int[] temp = new int[n];

        // for (int i = 0; i < n; i++) {

        // temp[i] = arr[(i + d) % n];

        // }

        // for (int i = 0; i < n; i++) {
        // System.out.print(temp[i] + " ");
        // }

        // OPTIMAL

        Scanner sc = new Scanner(System.in);

        int n = Integer.parseInt(sc.nextLine().trim());
        int[] arr = new int[n];

        String arrLine = sc.nextLine().trim();
        arrLine = arrLine.replaceAll("[\\[\\]]", "");
        String[] vals = arrLine.split("[\\s,]+");

        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(vals[i]);
        }

        int d = Integer.parseInt(sc.nextLine().trim());

        d = d % n;

        reverse(arr, 0, d - 1);
        reverse(arr, d, n - 1);
        reverse(arr, 0, n - 1);
        // reverse(arr, 0, n - 1);
        // reverse(arr, n - d, n - 1);
        // reverse(arr, 0, n - d - 1);

        for (int i = 0; i < n; i++) {

            System.out.print(arr[i] + " ");
        }
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
