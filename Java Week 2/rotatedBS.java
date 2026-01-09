import java.util.Scanner;

public class rotatedBS {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        //           0,1,2,3,4,5,6
        int[] arr = {4,5,6,7,0,1,2};
        int target = in.nextInt();
        int ans = findElement(arr, target);
        System.out.println("The found element index: " + ans + " value: " + arr[ans]);

    }

    static int findElement(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (arr[mid] == target) return mid;

            if (arr[start] <= arr[mid]) {
                if (arr[start] <= target && target < arr[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }else {
                if (arr[mid] < target && target <= arr[end]) {
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }
            }
            
        }
        return -1;

    } 
}
