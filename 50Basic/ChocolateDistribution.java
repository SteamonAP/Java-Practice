import java.util.*;
//if not told to maintain sequence
class ChocolateDistribution{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine().trim());
        int[] arr = new int[n];
        
        String arrLine = sc.nextLine().trim();
        arrLine = arrLine.replaceAll("[\\[\\]{}()]","");
        String[] vals = arrLine.split("[\\s,]+");
        
        for (int i = 0; i < n;i++){
            arr[i] = Integer.parseInt(vals[i]);
        }
        
        int m = Integer.parseInt(sc.nextLine().trim());
        Arrays.sort(arr);
        int minDiff = Integer.MAX_VALUE;
        
        for (int i = 0; i <= n - m; i++){
            minDiff = Math.min(minDiff,arr[i+m-1]-arr[i]);
        }
        
        System.out.print(minDiff);
    }
    
}

//IF to maintain order


// import java.util.*;

// class ChocolateDistribution{
//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);
//         int n = Integer.parseInt(sc.nextLine().trim());
//         int[] arr = new int[n];
        
//         String arrLine = sc.nextLine().trim();
//         arrLine = arrLine.replaceAll("[\\[\\]{}()]","");
//         String[] vals = arrLine.split("[\\s,]+");
        
//         for (int i = 0; i < n;i++){
//             arr[i] = Integer.parseInt(vals[i]);
//         }
        
//         int m = Integer.parseInt(sc.nextLine().trim());
        
//         int minDiff = Integer.MAX_VALUE;
        
//         for(int i = 0; i <= n - m; i++){
//             int min = arr[i];
//             int max = arr[i];
            
//             for(int j = i; j < i+m;j++){
//                 min = Math.min(min,arr[j]);
//                 max = Math.max(max,arr[j]);
//             }
//             minDiff = Math.min(minDiff,max-min);
//         }
        
//         System.out.print(minDiff);
//     }
    
// }