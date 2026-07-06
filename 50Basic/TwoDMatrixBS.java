import java.util.*;
public class TwoDMatrixBS {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String firstLine = sc.nextLine().trim();
        String[] parts = firstLine.split("\\s+");
        int r = Integer.parseInt(parts[0]);
        int c = Integer.parseInt(parts[1]);
        int target = Integer.parseInt(parts[2]);

        int[][] matrix = new int[r][c];
        for (int i = 0;i < r;i++){
            String line = sc.nextLine().trim();
            String[] vals = line.split("[\\s,]+");
            for (int j = 0; j < c;j++) {
                matrix[i][j] = Integer.parseInt(vals[j]);
            }
        }

        boolean found = binarySearch(matrix, target);

        if (found){
            System.out.println("Found");
        } else {
            System.out.println("Not Found");
        }

        sc.close();
    }

    public static boolean binarySearch(int[][] matrix, int target) {
        int r = matrix.length;
        int c = matrix[0].length;
        int low = 0;
        int high = (r * c) - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;
            int row = mid / c;
            int col = mid % c;

            if (matrix[row][col] == target) {
                return true;
            }else if (matrix[row][col] < target){
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return false;
    }
}
