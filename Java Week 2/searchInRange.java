import java.util.Scanner;

public class searchInRange {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] arr = { 18,12,-7,3,14,28 };
        int target = in.nextInt();

        int ans = lnSearch(arr, target, 1, 4);
        System.out.println(ans);
    }

    static int lnSearch(int[] arr, int target, int start, int end) {
        if (arr.length == 0) return -1;

        for(int i = start; i <= end; i++) {
            int n = arr[i];
            if (n == target) {
                return i;
            }
        }
        return -1;
        
        
    }
}
