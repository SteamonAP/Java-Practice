import java.util.*;

public class SubSet {
    public static void main(String[] args) {
        int[] arr = { 2, 1, 2 };
        //List<List<Integer>> ans = subset(arr);
        List<List<Integer>> ans = subsetdupli(arr);
        for (List<Integer> num : ans) {
            System.out.println(num);
        }

    }

    static List<List<Integer>> subset(int[] arr) {
        List<List<Integer>> outer = new ArrayList<>();

        outer.add(new ArrayList<>());

        for (int num : arr) {
            int n = outer.size();
            for (int i = 0; i < n; i++) {
                List<Integer> internal = new ArrayList<>(outer.get(i));
                internal.add(num);
                outer.add(internal);
            }
        }

        return outer;
    }

    // When found a duplicate element , only add it in the newly created subset of
    // previous step
    static List<List<Integer>> subsetdupli(int[] arr) {
        Arrays.sort(arr);
        List<List<Integer>> outer = new ArrayList<>();
        outer.add(new ArrayList<>());
        int start = 0;
        int end = 0;

        for (int i = 0; i < arr.length; i++) {
            if(i > 0 && arr[i] == arr[i-1]){
                start = end + 1;
            }
            end = outer.size() - 1;
            int n = outer.size();
            for (int j = start; j < n; j++) {
                List<Integer> internal = new ArrayList<>(outer.get(j));
                internal.add(arr[i]);
                outer.add(internal);
            }
        }

        return outer;
    }
}
