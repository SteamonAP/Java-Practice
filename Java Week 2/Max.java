import java.util.Scanner;

public class Max {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter size: ");
        int n = in.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter array: ");

        for (int i = 0; i < arr.length; i++) {
            arr[i] = in.nextInt();
        }

        System.out.println("THe max of your array is: " + maxRange(arr,1,3));

    }

    static int max(int[] arr) {
        if (arr.length == 0) return -1;
        int maxi = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > maxi) {
                maxi = arr[i];
            }

    
        }
        return maxi;
    }

    static int maxRange(int[] arr, int s, int e) {

        if (e > s) return -1;
        if (arr == null) return -1;
        int maxi = arr[s];
        for (int i = s; i <= e; i++) {
            if (arr[i] > maxi) {
                maxi = arr[i];
            }
        }
        return maxi;
    }


}
