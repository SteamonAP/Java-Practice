import java.util.*;

class LongestSubArrayWithSum0{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine().trim());
        
        int[] arr = new int[n];
        
        String arrLine = sc.nextLine().trim();
        arrLine = arrLine.replaceAll("[\\[\\]{}()]","");
        String[] vals = arrLine.split("[\\s,]+");
        
        for(int i = 0; i < n; i++){
            arr[i] = Integer.parseInt(vals[i]);
        }
        
        int answer = largestLength(arr,n);
        System.out.print(answer);
    }
    
    public static int largestLength(int[] arr, int n){
        int preSum = 0;
        int maxi = 0;
        Map<Integer,Integer> mpp = new HashMap<>();
        
        for(int i = 0; i < n;i++){
            preSum += arr[i];
            if (preSum==0){
                maxi = i + 1;
            }else{
                if (mpp.containsKey(preSum)){
                    maxi = Math.max(maxi,i - mpp.get(preSum));
                }else {
                    mpp.put(preSum,i);
                }
            }
            
        }
        return maxi;
        
    }
}