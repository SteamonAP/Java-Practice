import java.util.*;

public class BS {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String firstLine = sc.nextLine().trim();
        String[] parts = firstLine.split("\\s+");
        int N = Integer.parseInt(parts[0]);
        int target = Integer.parseInt(parts[1]);

        String arrLine = sc.nextLine().trim();
        String[] arrStr = arrLine.split("[\\s,]+");
        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(arrStr[i]);
        }

        int l = 0; int r = N -1;
        int idx = -1;

        while (l <= r) {
            int mid = l + (r - l) /2;
            if (arr[mid] == target) {
                idx = mid;
                break;
            } else if (arr[mid] < target) {
                l = mid + 1;
            } else {
                r = mid - 1;
            }
        }
        System.out.println(idx);
    }
}
