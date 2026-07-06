import java.util.*;

class OddnumInArr {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int n = Integer.parseInt(sc.nextLine().trim());
        int[] arr = new int[n];
        String arrLine = sc.nextLine().trim();
        arrLine = arrLine.replaceAll("[\\[\\]{}()]","");
        String[] vals = arrLine.split("[\\s,]+");
        
        for (int i = 0; i < n; i++){
            arr[i] = Integer.parseInt(vals[i]);
        }
        
        int answer = oddOne(arr);
        System.out.print(answer);
    }
    
    public static int oddOne(int[] arr){
        int n = arr.length;
        int l = 0;
        int r = n-1;
        
        while(l <= r){
            int mid = l + (r-l)/2;
            
            if(arr[mid-1] != arr[mid] && arr[mid + 1] != arr[mid]){
                return arr[mid];
            }
            if(mid % 2 != 0){
                if(arr[mid - 1] == arr[mid]){
                    l = mid + 1;
                } else {
                    r = mid - 1;
                }
            } else {
                if(arr[mid - 1] == arr[mid]){
                    r = mid -1;
                }else {
                    l = mid + 1;
                }
            }
        }
        return -1;
    }
}