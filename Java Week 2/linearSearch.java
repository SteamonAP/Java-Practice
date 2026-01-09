import java.util.Scanner;

public class linearSearch {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] nums = { 22,34,564,12,54,67,52,-11 };

        int target = in.nextInt();
        int ans = lnSearch(nums, target);
        System.out.println("Your target present on index: " + ans );
        
    }
    //search array
    static int lnSearch(int[] arr, int target) {
        if (arr.length == 0) return -1;

        for(int i = 0; i < arr.length; i++) {
            int n = arr[i];
            if (n == target) {
                return i;
            }
        }
        return -1;
        
        
    }
}
