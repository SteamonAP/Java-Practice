import java.util.*;

public class JosephusGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String firstLine = sc.nextLine().trim();
        String[] parts = firstLine.split("\\s+");
        int n = Integer.parseInt(parts[0]);
        int k = Integer.parseInt(parts[1]);

        String line = sc.nextLine().trim();
        String[] arrStr = line.split("[\\s,]+");
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < n;i++) {
            list.add(Integer.parseInt(arrStr[i]));
        }

        int idx = 0;

        while (list.size() > 1) {
            idx = (idx + (k - 1)) % list.size();
            list.remove(idx);
        }
        System.out.println(list.get(0));

    }
}
