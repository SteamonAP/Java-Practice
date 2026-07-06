import java.util.*;

class LongestSubArrayWithSumK {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine().trim());
        int[] arr = new int[n];
        
        String arrLine = sc.nextLine().trim();
        arrLine = arrLine.replaceAll("[\\[\\]{}()]","");
        String[] vals = arrLine.split("[\\s,]+");
        
        for (int i = 0;i < n;i++){
            arr[i] = Integer.parseInt(vals[i]);
        }
        
        int k = Integer.parseInt(sc.nextLine().trim());
        
        int sum = 0;
        int maxLen = 0;
        HashMap<Integer,Integer> mpp = new HashMap<>();
        
        for(int i =0;i<n;i++){
            sum += arr[i];
            if(sum == k){
                maxLen = i + 1;
            }
            int rem = sum - k;
            if(mpp.containsKey(rem)){
                maxLen = Math.max(maxLen, i- mpp.get(rem));
            }
            if(!mpp.containsKey(sum)){
                
                mpp.put(sum,i);
            }
        }
        System.out.print(maxLen);
        
        
    }
}