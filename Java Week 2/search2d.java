import java.util.Arrays;
import java.util.Scanner;

public class search2d {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] arr = {
                {23,1,35},
                {56,7,834,5},
                {79,45,1,0},
                {24,7}
        };

        int target = sc.nextInt();
        int[] ans = search(arr, target);
        int ans1 = max(arr);
        System.out.println(Arrays.toString(ans));
        System.out.println(ans1);
    }

    static int[] search(int[][] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] == target) {
                    return new int[]{i,j};
                }
            }
        }
        return new int[]{-1,-1};

    }

    static int max(int[][] arr) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i< arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] > max) {
                    max = arr[i][j];
                }
                
            }
        }
        return max; 

    }




}
