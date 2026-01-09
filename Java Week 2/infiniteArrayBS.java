import java.util.Scanner;

public class infiniteArrayBS {

    static int get(int[] arr, int index) {
        if (index >= arr.length) {
            return Integer.MAX_VALUE; // simulate infinity
        }
        return arr[index];
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] arr = { 4, 5, 9, 11, 15, 19, 23, 47, 64, 128, 264, 346, 728, 999 };
        int target = in.nextInt();
        int ans = findPos(arr, target);
        if (ans != -1) {

            System.out.println("The position of the element in infinite array: " + ans + " ANd element : " + arr[ans]);
        } else {
            System.out.println("Element not found");
        }

    }

    static int findPos(int[] arr, int target) {

        int start = 0;
        // int end = start + 1;
        int end = 1;

        // while (target > arr[end]) {
        // start = end;
        // end = Math.min(end * 2, arr.length - 1);
        // }

        while (get(arr, end) < target) {
            start = end;
            end = end * 2;
        }
        while (start <= end) {

            int mid = start + (end - start) / 2;
            int midVal = get(arr, mid);
            if (target > midVal) {
                start = mid + 1;
            } else if (target < midVal) {
                end = mid - 1;
            } else {
                return mid;
            }

        }

        return -1;

    }

}
