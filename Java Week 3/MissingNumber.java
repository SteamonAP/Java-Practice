// import java.util.*;

// class MissingNumber {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int n = Integer.parseInt(sc.nextLine().trim());
//         int[] arr = new int[n];

//         String arrLine = sc.nextLine().trim();
//         arrLine = arrLine.replaceAll("[\\[\\]{}()]", "");
//         String[] vals = arrLine.split("[\\s,]+");

//         for (int i = 0; i < n; i++) {
//             arr[i] = Integer.parseInt(vals[i]);
//         }
//         int answer = missingNum(arr);
//         System.out.print(answer);
//     }

//     public static int missingNum(int[] arr) {
//         int n = arr.length;
//         int i = 0;
//         while (i < n) {
//             int correct = arr[i];
//             if (arr[i] < n && arr[i] != arr[correct]) {
//                 swap(arr, i, correct);
//             } else {
//                 i++;
//             }
//         }

//         for (int j = 0; j < n; j++) {
//             if (arr[j] != j) {
//                 return j;
//             }
//         }
//         return n;
//     }

//     public static void swap(int[] arr, int s, int e) {
//         int temp = arr[s];
//         arr[s] = arr[e];
//         arr[e] = temp;
//     }

// }



import java.util.*;

class missingNum{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int n = Integer.parseInt(sc.nextLine().trim());
        
        String arrLine = sc.nextLine().trim();
        arrLine = arrLine.replaceAll("[\\[\\]{}()]","");
        String[] vals = arrLine.split("[\\s,]+");
        int[] arr = new int[vals.length];
        
        
        for(int i = 0 ; i < vals.length; i++){
            arr[i] = Integer.parseInt(vals[i]);
        }
        
        
        int answer = missingNum(arr);
        System.out.print(answer);
        
    }
    
    public static int missingNum(int[] arr){
        int n = arr.length;
        int i = 0;
        while(i < n){
            int correct = arr[i] - 1;
            if (arr[i] > 0 && arr[i] <= n && arr[i] != arr[correct]){
                swap(arr,i,correct);
            }else {
                i++;
            }
        }
        
        for (int j = 0; j < n; j++){
            if(arr[j] != j + 1){
                return j + 1;
            }
        }
        return n + 1;
    }
    
    public static void swap(int[] arr,int s,int e){
        int temp = arr[s];
        arr[s] = arr[e];
        arr[e] = temp;
    }
}