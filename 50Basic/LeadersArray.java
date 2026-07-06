import java.util.*;

public class LeadersArray {
    

    public static void main(String[] args) {
        int[] arr = {16, 17, 4, 3, 5, 2};
        int[] ans = leaderArr(arr);
        System.out.print(Arrays.toString(ans));
    }

    public static int[] leaderArr(int[] arr) {
        int max = Integer.MIN_VALUE;

        List<Integer> result = new ArrayList<>();

        for (int i = arr.length -1; i >= 0;i--){
            if (arr[i] > max) {
                max = arr[i];
                result.add(arr[i]);
            }
        }

        Collections.reverse(result);

        int[] ans = new int[result.size()];

        for (int i = 0; i < result.size(); i++){
            ans[i] = result.get(i);
        }

        return ans;
        
    }
}
