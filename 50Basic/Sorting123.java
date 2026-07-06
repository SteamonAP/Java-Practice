
// import java.util.*;

// public class Sorting123 {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         String arrLine = sc.nextLine().trim();
//         arrLine = arrLine.replaceAll("[\\[\\]{}()\"]", "");
//         String[] vals = arrLine.split("[\\s,]+");

//         int n = vals.length;

//         int[] arr = new int[n];

//         for (int i = 0; i < n; i++) {
//             arr[i] = Integer.parseInt(vals[i]);
//         }

//         // Better Solution than Sorting 

//         // int cnt_Z = 0;
//         // int cnt_O = 0;
//         // int cnt_T = 0;

//         // for (int i = 0; i < n; i++) {
//         //     if (arr[i] == 0) {
//         //         cnt_Z++;
//         //     } else if (arr[i] == 1) {
//         //         cnt_O++;
//         //     } else if (arr[i] == 2) {
//         //         cnt_T++;
//         //     } else {
//         //         System.out.println("Invalid input: only 0,1,2 allowed");
//         //         return;
//         //     }
//         // }

//         // for (int i = 0; i < cnt_Z; i++) {
//         //     arr[i] = 0;
//         // }
//         // for (int i = cnt_Z; i < cnt_Z + cnt_O; i++) {
//         //     arr[i] = 1;
//         // }

//         // for (int i = cnt_Z + cnt_O; i < n; i++) {
//         //     arr[i] = 2;
//         // }

//         // Dutch National Flag Algorithm

//         int low = 0;
//         int mid = 0;
//         int high = n - 1;
//         while (mid <= high) {
//             if (arr[mid] == 0) {
//                 swap(arr, low , mid);
//                 low++;
//                 mid++;
//             } else if (arr[mid] == 1) {
//                 mid++;
//             } else if (arr[mid] == 2) {
//                 swap(arr, mid, high);
//                 high--;
//             } else {
//                 return;
//             }
//         }

//         for (int i = 0; i < n; i++) {
//             System.out.print(arr[i]);
//             if (i < n - 1) {
//                 System.out.print(",");
//             }
//         }
//     }

//     public static void swap(int[] arr, int s , int e) {
//         int temp = arr[s];
//         arr[s] = arr[e];
//         arr[e] = temp;
//         s++;
//         e--;
//     }

// }

import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = Integer.parseInt(sc.nextLine().trim());

        int[] arr = new int[n];

        // String arrLine = sc.nextLine().trim();
        // arrLine = arrLine.replaceAll("[\\[\\]{}()\"]", "");
        // String[] vals = arrLine.split("[\\s,]+");

        // for (int i =0 ; i<n;i++){
        // arr[i] = Integer.parseInt(vals[i]);
        // }

        List<Integer> list = new ArrayList<>();
        while (list.size() < n) {
            String line = sc.nextLine().trim();
            line = line.replaceAll("[\\[\\]{}()\"]", "");
            String[] vals = line.split("[\\s,]+");

            for (String v : vals) {
                if (!v.isEmpty()) {
                    list.add(Integer.parseInt(v));
                }
            }
        }
        for (int i = 0; i < n; i++) {
            arr[i] = list.get(i);
        }

        int low = 0;
        int mid = 0;
        int high = n - 1;

        while (mid <= high) {
            if (arr[mid] == 0) {
                swap(arr, low, mid);
                low++;
                mid++;
            } else if (arr[mid] == 1) {
                mid++;
            } else if (arr[mid] == 2) {
                swap(arr, mid, high);
                high--;
            }
        }

        for (int i = 0; i < n; i++) {
            System.out.print(arr[i]);
            if (i < n - 1) {
                System.out.print(",");
            }
        }
    }

    public static void swap(int[] arr, int s, int e) {
        int temp = arr[s];
        arr[s] = arr[e];
        arr[e] = temp;
        s++;
        e--;
    }
}
