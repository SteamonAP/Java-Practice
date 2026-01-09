import java.util.*;

public class evenSort {


    public static int[] solve(int[] arr) {
        List<Integer> evens = new ArrayList<>();
        for (int num : arr) {
            if (num % 2== 0) {
                evens.add(num);
            }

        }

        Collections.sort(evens, Collections.reverseOrder());

        int sum = 0;
        for (int num : evens) {
            sum += num;
        }

        List<Integer> result = new ArrayList<>();


        int evenIdx = 0;
        for (int i = 0; i < arr.length ; i ++) {
            if (arr[i] % 2 == 0) {
                result.add(evens.get(evenIdx));
                evenIdx++;
            } else {
                result.add(arr[i]);
            }
        }

        result.add(sum);

        int[] finalArray = new int[result.size()];
        for (int i = 0; i < result.size(); i++) {
            finalArray[i] = result.get(i);
        }
        return finalArray;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String input = sc.nextLine();
        String[] tokens = input.trim().split("\\s+");
        int[] arr = new int[tokens.length];
        for (int i = 0; i < tokens.length; i++) {
            arr[i] = Integer.parseInt(tokens[i]);
        }
        int[] result = solve(arr);

        for (int i = 0; i< result.length ; i++) {
            System.out.print(result[i]);
            if (i < result.length - 1) System.out.print(" ");
        }

        sc.close();
    }
}