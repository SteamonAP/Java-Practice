// import java.util.*;

// public class CountSundays {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         String day = sc.nextLine().trim().toLowerCase();
//         int n = Integer.parseInt(sc.nextLine().trim());

//         Map<String, Integer> mpp = new HashMap<>();

//         mpp.put("mon", 0);
//         mpp.put("tue", 1);
//         mpp.put("wed", 2);
//         mpp.put("thu", 3);
//         mpp.put("fri", 4);
//         mpp.put("sat", 5);
//         mpp.put("sun", 6);

//         int count = 0;
//         int startIdx = mpp.get(day);
//         for (int i = 0; i <= n; i++) {
//             int ans = (startIdx + i) % 7;
//             if (ans == 6) {
//                 count++;
//             }
//         }

//         System.out.print(count);
//     }
// }

import java.util.*;

public class CountSundays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String day = sc.nextLine().trim().toLowerCase();
        int n = Integer.parseInt(sc.nextLine().trim());

        HashMap<String, Integer> mpp = new HashMap<>();
        mpp.put("mon", 1);
        mpp.put("tue", 2);
        mpp.put("wed", 3);
        mpp.put("thu", 4);
        mpp.put("fri", 5);
        mpp.put("sat", 6);
        mpp.put("sun", 7);
        int start = mpp.get(day.substring(0, 3));
        int count = 0;
        for (int i = 0; i < n; i++) {
            if ((start + i) % 7 == 0) {
                count++;
            }
        }

        System.out.print(count);
    }
}