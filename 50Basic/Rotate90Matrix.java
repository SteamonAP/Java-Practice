import java.util.*;

public class Rotate90Matrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine().trim());

        int[][] matrix = new int[n][n];

        for (int i = 0;i < n;i++) {
            String line = sc.nextLine().trim();
            String[] parts = line.split("[\\s,]+");
            for (int j = 0; j < n;j++) {
                matrix[i][j] = Integer.parseInt(parts[j]);
            }
        }

        for (int i = 0; i < n ;i++) {
            for (int j = i + 1; j < n;j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }

        for (int i = 0; i < n;i++) {
            int start = 0, end = n - 1;
            while (start < end) {
                int temp = matrix[i][start];
                matrix[i][start] = matrix[i][end];
                matrix[i][end] = temp;
                start++;
                end--;
            }
        }
        for (int i = 0; i < n ;i++){
            for (int j = 0; j < n ; j++){
                System.out.print(matrix[i][j] + (j < n - 1 ? " " : ""));
            }
            System.out.println();
        }
    }
}
