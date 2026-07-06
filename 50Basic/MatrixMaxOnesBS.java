
//sorted BS
import java.util.*;

class MatrixMaxOnesBS {

    public static int firstOnes(int[] row, int C) {
        int left = 0;
        int right = C - 1;
        int ans = -1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (row[mid] == 1) {
                ans = mid;
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return ans;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String firstLine = sc.nextLine().trim();
        String[] parts = firstLine.split("\\s+");
        int R = Integer.parseInt(parts[0]);
        int C = Integer.parseInt(parts[1]);

        int[][] matrix = new int[R][C];

        List<Integer> list = new ArrayList<>();

        while (list.size() < R * C) {
            String line = sc.nextLine().trim();
            line = line.replaceAll("[\\[\\]{}()]", "");
            String[] vals = line.split("[\\s,]+");

            for (String v : vals) {
                if (!v.isEmpty()) {
                    list.add(Integer.parseInt(v));
                }
            }
        }
        int idx = 0;
        for (int i = 0; i < R; i++) {
            for (int j = 0; j < C; j++) {
                matrix[i][j] = list.get(idx++);
            }
        }

        int max_ones = 0;
        int index = -1;

        for (int i = 0; i < R; i++) {
            int firstOne = firstOnes(matrix[i], C);
            int count = 0;

            if (firstOne != -1) {
                count = C - firstOne;
            }

            if (count > max_ones) {
                max_ones = count;
                index = i + 1;
            }
        }

        System.out.print(index);

    }
}