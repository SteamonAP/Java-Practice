import java.util.*;

class RecursiveSubSet {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int n = Integer.parseInt(sc.nextLine().trim());
        int[] arr = new int[n];
        
        String firstLine = sc.nextLine().trim();
        firstLine = firstLine.replaceAll("[\\[\\]{}()]" , "");
        String[] parts = firstLine.split("[\\s,]+");
        
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(parts[i]);
        }
        
        int target = Integer.parseInt(sc.nextLine().trim());
        
        List<Integer> subset = new ArrayList<>();
        
        if (solve(n-1,target, arr, subset)){
            System.out.println("Yes");
            
            Collections.reverse(subset);
            for (int num : subset){
                System.out.print(num + " ");
            }
        } else {
            System.out.println("No");
        }
        
    }
    
    
    public static boolean solve(int index , int target, int[] arr, List<Integer> subset) {
        if (target == 0) {
            return true;
        }
        
        if (index < 0 || target < 0){
            return false;
        }
        
        subset.add(arr[index]);
        
        if (solve(index -1, target - arr[index] , arr, subset)){
            return true;
        }
        subset.remove(subset.size() -1);
        
        return solve(index - 1, target, arr, subset);
    }
}