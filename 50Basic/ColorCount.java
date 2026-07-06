import java.util.*;

public class ColorCount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine().trim());

        String[] arr = new String[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextLine().trim();
        }

        HashMap<String, Integer> mpp = new HashMap<>();

        for (String ch : arr) {
            mpp.put(ch, mpp.getOrDefault(ch, 0) + 1);
        }

        for (int i = 0; i < n; i++) {
            if (mpp.get(arr[i]) % 2 != 0) {
                System.out.print(arr[i]);
                return;
            }
        }
        System.out.print("All are even");
    }
}
 