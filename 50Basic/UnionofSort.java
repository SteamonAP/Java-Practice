import java.util.*;

public class UnionofSort {
    public static void main(String[] args) {
        int[] a = { 1, 2, 2, 3, 5 };
        int[] b = { 2, 3, 4, 6 };

        System.out.println(union(a, b));
        System.out.println(interscetion(a, b));
    }
    // Brute Force appraoch
    // public static int[] union(int[] a1, int[] a2) {

    // Set<Integer> set = new TreeSet<>();

    // for (int x : a1) {
    // set.add(x);
    // }

    // for (int x : a2) {
    // set.add(x);
    // }

    // int[] result = new int[set.size()];
    // int i = 0;
    // for (int x : set) {
    // result[i++] = x;
    // }

    // return result;

    // }

    public static ArrayList<Integer> union(int[] a, int[] b) {
        ArrayList<Integer> res = new ArrayList<>();

        int i = 0;
        int j = 0;

        int n = a.length;
        int m = b.length;

        while (i < n && j < m) {
            if (i > 0 && a[i] == a[i - 1]) {
                i++;
                continue;
            }

            if (j > 0 && b[j] == b[j - 1]) {
                j++;
                continue;
            }

            if (a[i] < b[j]) {
                res.add(a[i]);
                i++;
            } else if (a[i] > b[j]) {
                res.add(b[j]);
                j++;
            } else {
                res.add(a[i]);
                i++;
                j++;
            }

        }

        while (i < n) {
            if (i == 0 || a[i] != a[i - 1]) {
                res.add(a[i]);
                i++;
            }
        }

        while (j < m) {
            if (j == 0 || b[j] != b[j - 1]) {
                res.add(b[j]);
                j++;
            }
        }

        return res;
    }

    public static ArrayList<Integer> interscetion(int[] a, int[] b) {
        ArrayList<Integer> result = new ArrayList<>();

        int i = 0;
        int j = 0;

        while (i < a.length && j < b.length) {
            if (a[i] < b[j]) {
                i++;
            } else if (a[i] > b[j]) {
                j++;
            } else {
                if (result.isEmpty() || result.get(result.size() - 1) != a[i]){
                    result.add(a[i]);
                }
                i++;
                j++;
            }
        }

        return result;
    }

}
