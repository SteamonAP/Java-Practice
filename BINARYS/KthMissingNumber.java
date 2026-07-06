import java.util.*;

class KthMissingNumber{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine().trim());
        int[] arr = new int[n];
        
        String arrLine = sc.nextLine().trim();
        arrLine = arrLine.replaceAll("[\\[\\]{}()]","");
        String[] vals = arrLine.split("[\\s,]+");
        
        for (int i = 0 ; i < n; i++){
            arr[i] = Integer.parseInt(vals[i]);
        }
        
        int K = Integer.parseInt(sc.nextLine().trim());
        
        int answer = missingNumber(arr,K);
        System.out.print(answer);
    }
    
    public static int missingNumber(int[] arr,int k){
        int n = arr.length;
        int low = 0;
        int high = n-1;
        
        while (low <= high){
            int mid = low + (high - low) / 2;
            
            int missing  = arr[mid] - mid - 1;
            
            if (k > missing){
                low = mid + 1;
            }else {
                high = mid -1;
            }
        }
        return k + high + 1;
    }
}