import java.util.*;

public class RotateArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String firstLine = sc.nextLine().trim();
        String[] parts = firstLine.split("\\s+");
        int N = Integer.parseInt(parts[0]);
        int K = Integer.parseInt(parts[1]);


        String arrLine = sc.nextLine().trim();
        if (arrLine.startsWith("[")) arrLine = arrLine.substring(1, arrLine.length() - 1);
        String[] arrStr = arrLine.split("[\\s,]+"); //split by space of comma
        int[] arr = new int[N];
        for(int i = 0;i < N; i++) {
            arr[i] = Integer.parseInt(arrStr[i]);
        }

        K = K % N;

        reverse(arr, 0, N-1);
        reverse(arr, 0, K-1);
        reverse(arr, K, N-1);

        for (int i = 0; i < N ;i++){
            System.out.print(arr[i] + (i < N - 1 ?  " " :""));
        }
    }

    


    public static void reverse(int[] arr, int start, int end) {
        while(start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
}
