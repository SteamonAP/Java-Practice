import java.util.*;

public class matrixSum {

    public static int[] columnSum(int[][] matrix) {
        if (matrix == null || matrix.length == 0){
            return new int[0];
        }

        int rows = matrix.length;
        int cols = matrix[0].length;

        int[] result = new int[cols];

        for (int col = 0; col < cols; col++) {
            int sum = 0;

            for (int row = 0; row < rows; row++){
                sum += matrix[row][col];
            }
            result[col] = sum;
        }

        return result;
    }

    public static int[] rowSum(int[][] matrix) {
        if (matrix == null || matrix.length == 0){
            return new int[0];
        }

        int rows = matrix.length;
        int cols = matrix[0].length;

        int[] result = new int[rows];

        for (int row = 0; row < rows ; row++){
            int sum = 0;
            for (int col = 0; col < cols; col++){
                sum += matrix[row][col];
            }
            result[row] = sum;
        }

        return result;
    }

    public static int diagonalSum(int[][] matrix) {
        int sum = 0;
        int n = matrix.length;

        for (int i = 0; i < n; i++){
            sum += matrix[i][i];
        }

        return sum;
    }


}
