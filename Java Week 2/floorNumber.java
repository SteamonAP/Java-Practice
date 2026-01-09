import java.util.Scanner;
public class floorNumber {

    //Biggest number , smaller than or equal to target number 
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // System.out.println("Enter size n: ");
        // int n = in.nextInt();
        // int[] arr = new int[n];
        // System.out.println("Enter array: ");
        // for (int i = 0; i < arr.length; i++) {
        // arr[i] = in.nextInt();
        // }

        // System.out.println("enter target");
        // int target = in.nextInt();

        // int ans = binarySearch(arr, target);

        int[] arr = { 4, 5, 9, 11, 15, 19, 23, 47, 64 };
        int target = in.nextInt();
        int ans = floorNumber(arr, target);
        if (ans == arr.length) {
            System.out.println("No floor exists");
        } else {
            System.out.println("Floor index: " + ans + ", value: " + arr[ans]);
        }

    }

    static int floorNumber(int[] arr, int target) {

        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (target > arr[mid]){
                start = mid + 1;
            } else if (target < arr[mid]) {
                end = mid - 1;
            } else {
                return mid;
            }
            
        }
        return end;



    }
}
