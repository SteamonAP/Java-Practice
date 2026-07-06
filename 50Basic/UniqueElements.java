import java.util.*;

class UniqueElements {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine().trim());
        int[] arr = new int[n];
        
        String arrLine = sc.nextLine().trim();
        arrLine = arrLine.replaceAll("[\\[\\]{}()]" , "");
        String[] vals = arrLine.split("[\\s,]+");
        
        for (int i = 0 ; i < n ;i++) {
            arr[i] = Integer.parseInt(vals[i]);
        }
        
        HashMap<Integer, Integer> mpp = new HashMap<>();
        
        for (int i = 0 ; i < n; i++) {
            mpp.put(arr[i] , mpp.getOrDefault(arr[i] ,0) + 1);
        }
        
        // for (int key : mpp.keySet()) {
        //     if (mpp.get(key) == 1){
        //         System.out.print(key);
        //     }
        // }
        
        for (int i = 0; i < n; i++) {
            if (mpp.get(arr[i]) == 1){
                System.out.println(arr[i]);
                break;
            }
        }
        sc.close();
    }
}