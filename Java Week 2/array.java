import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class array {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // int[] arr = new int[5];
        // System.out.println(num1[0]);

        // String[] arr = new String[4];
        // System.out.println(arr[0]);

        // arr[0] = 23;
        // arr[1] = 4;
        // System.out.println(arr[1]);

        // for (int i = 0; i < arr.length; i++){
        //     arr[i] = in.nextInt();
        // }
        // for (int i = 0; i < arr.length; i++){
        //     System.out.print(arr[i] +" " );
        // // }
        // System.out.println(Arrays.toString(arr));


        // String[] str = new String[4];
        // for (int i=0 ; i < str.length ; i++) {
        //     str[i] = in.next();
        // }
        // System.out.println(Arrays.toString(str));

        //2D

        // int[][] arr = new int[3][3];//only number of rows is mandatory;

        // for (int i = 0; i < arr.length; i++){
        //     for (int j = 0; j < arr[i].length; j++) {
        //         arr[i][j] = in.nextInt();
        //     }

        // }
        // for (int i = 0; i < arr.length; i++){
        //     for (int j = 0; j < arr[i].length; j++) {
        //         System.out.print(arr[i][j] + " ");
        //     }
        //     System.out.println();

        // }
        // for (int i = 0; i < arr.length; i++) {
        //     System.out.println(Arrays.toString(arr[i]));
        // }
        int[] arr = {1,2,3,4,5};
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }

    }
    
}
