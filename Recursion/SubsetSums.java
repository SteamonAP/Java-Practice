import java.util.*;

public class SubsetSums {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        ArrayList<Integer> arr = new ArrayList<>();
        for(int i = 0 ; i < n;i++){
            arr.add(sc.nextInt());
        }
        System.out.println(subsetSum(arr,n));
        
    }

    public static ArrayList<Integer> subsetSum(ArrayList<Integer> arr, int n){
        ArrayList<Integer> ans = new ArrayList<>();
        func(0,0,arr,n,ans);
        Collections.sort(ans);
        return ans;
    }

    public static void func(int idx,int sum, ArrayList<Integer> arr, int n, ArrayList<Integer> ans){
        if(idx == n){
            ans.add(sum);
            return;
        }

        func(idx + 1, sum + arr.get(idx), arr, n, ans);
        func(idx + 1, sum, arr, n, ans);
    }

}
