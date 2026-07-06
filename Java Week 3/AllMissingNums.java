import java.util.*;

class AllMissingNums {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine().trim());
        int[] arr = new int[n];

        String arrLine = sc.nextLine().trim();
        arrLine = arrLine.replaceAll("[\\[\\]{}()]", "");
        String[] vals = arrLine.split("[\\s,]+");

        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(vals[i]);
        }
        ArrayList<Integer> answer = allmissingNum(arr);
        System.out.print(answer);
    }

    public static ArrayList<Integer> allmissingNum(int[] arr) {
        int n = arr.length;
        int i = 0;
        while (i < n) {
            int correct = arr[i] - 1;
            if (arr[i] != arr[correct]) {
                swap(arr, i, correct);
            } else {
                i++;
            }
        }

        ArrayList<Integer> result = new ArrayList<>();
        for (int j = 0; j < n; j++) {
            if (arr[j] != j + 1) {
                result.add(j + 1);

            }
        }
        return result;

    }

    public static void swap(int[] arr, int s, int e) {
        int temp = arr[s];
        arr[s] = arr[e];
        arr[e] = temp;
    }

}