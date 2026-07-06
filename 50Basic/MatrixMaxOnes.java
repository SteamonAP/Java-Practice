
//Unsorted BF
import java.util.*;

class MatrixMaxOnes {
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
        int max_ones = 0;
        int index = -1;
        int idx = 0;
        for (int i = 0; i < R; i++) {
            int count = 0;
            for (int j = 0; j < C; j++) {
                matrix[i][j] = list.get(idx++);
                count += matrix[i][j];

            }
            if (count > max_ones) {
                max_ones = count;
                index = i + 1;
            }
        }
        System.out.print(index);
    }
}