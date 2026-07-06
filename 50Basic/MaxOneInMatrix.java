import java.util.*;

public class MaxOneInMatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String firstLine = sc.nextLine().trim();
        String[] parts = firstLine.split("\\s+");
        int r = Integer.parseInt(parts[0]);
        int c = Integer.parseInt(parts[1]);

        int[][] matrix = new int[r][c];
        for (int i = 0; i < r; i++) {
            String line = sc.nextLine().trim();
            String[] vals = line.split("[\\s,]+");
            for (int j = 0; j < c; j++) {
                matrix[i][j] = Integer.parseInt(vals[j]);
            }
        }

        int maxRow = 0;
        int maxCount = 0;

        for (int i = 0; i < r; i++) {
            int count = 0;
            for (int j = 0; j < c;j++) {
                if (matrix[i][j] == 1) count++;
            }

            if (count > maxCount) {
                maxCount = count;
                maxRow = i;
            }
        }

        System.out.println(maxRow);
    }
}
