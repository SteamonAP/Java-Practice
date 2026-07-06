import java.util.*;

public class SpiralTraversal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String firstLine = sc.nextLine().trim();
        String[] parts = firstLine.split("\\s+");
        int R = Integer.parseInt(parts[0]);
        int C = Integer.parseInt(parts[1]);

        int[][] matrix = new int[R][C];
        for (int i = 0; i < R; i++) {
            String line = sc.nextLine().trim();
            String[] value = line.split("[\\s,]+");
            for (int j = 0; j < C; j++) {
                matrix[i][j] = Integer.parseInt(value[j]);
            }
        }

        int top = 0, bottom = R - 1, left = 0, right = C - 1;

        StringBuilder result = new StringBuilder();
        while (top <= bottom && left <= right) {
            for (int i = left; i <= right; i++) {
                result.append(matrix[top][i] + " ");
            }
            top++;
            for (int i = top; i <= bottom; i++) {
                result.append(matrix[i][right] + " ");
            }
            right--;
            if (top <= bottom) {

                for (int i = right; i >= left; i--) {
                    result.append(matrix[bottom][i] + " ");
                }
                bottom--;
            }
            if (left <= right) {
                for (int i = bottom; i >= top; i--) {
                    result.append(matrix[i][left] + " ");
                }
                left++;
            }
        }
        System.out.println(result.toString().trim());
    }
}
