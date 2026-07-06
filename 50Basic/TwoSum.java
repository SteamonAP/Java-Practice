import java.util.*;

public class TwoSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String first = sc.nextLine().trim();
        String[] parts = first.split("\\s+");
        int n = Integer.parseInt(parts[0]);
        int target = Integer.parseInt(parts[1]);

        String arrLine = sc.nextLine().trim();
        String[] arrStr = arrLine.split("[\\s,]+");
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(arrStr[i]);
        }

        for (int i = 0; i < n - 1; i++) {
            int minIdx = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minIdx]) {
                    minIdx = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[minIdx];
            arr[minIdx] = temp;
        }

        int s = 0;
        int e = n - 1;
        boolean found = false;

        while (s < e) {
            int sum = arr[s] + arr[e];

            if (sum == target) {
                found = true;
                break;
            } else if (sum < target) {
                s++;
            } else {
                e--;
            }
            
        }

        System.out.println(found ? "Yes" : "No");
    }

}
