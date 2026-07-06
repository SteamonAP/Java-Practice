// Brute Force

// import java.util.*;

// class MovingZerosEnd {
//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);
//         int n = Integer.parseInt(sc.nextLine().trim());
//         int[] arr = new int[n];
        
//         String arrLine = sc.nextLine().trim();
//         arrLine = arrLine.replaceAll("[\\[\\]{}()]","");
//         String[] vals = arrLine.split("[\\s,]+");
        
//         for (int i = 0; i < n ; i++){
//             arr[i] = Integer.parseInt(vals[i]);
//         }
        
//         ArrayList<Integer> zeros = new ArrayList<>();
        
//         for (int i = 0; i < n ;i++){
//             if (arr[i] == 0){
//                 zeros.add(arr[i]);
//             }
//         }
//         ArrayList<Integer> answer = new ArrayList<>();
        
//         for (int i = 0; i < n;i++){
//             if (arr[i] != 0){
//                 answer.add(arr[i]);
//             }
//         }
        
//         for (int i = 0; i < zeros.size(); i++){
//             answer.add(zeros.get(i));
//         }
        
//         for(int i = 0; i < answer.size();i++){
//             System.out.print(answer.get(i) + " ");
//         }
//     }
// }


///Optimal 2 pointer


import java.util.*;

class MovingZerosEnd {
    public static void swap(int i, int j, int[] arr){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine().trim());
        
        int[] arr = new int[n];
        
        String arrLine = sc.nextLine().trim();
        arrLine = arrLine.replaceAll("[\\[\\]{}()]","");
        String[] vals = arrLine.split("[\\s,]+");
        
        for (int i = 0 ;i < n ;i++){
            arr[i] = Integer.parseInt(vals[i]);
        }
        
        int j = -1;
        
        for (int i = 0 ; i < n ;i++){
            if (arr[i] ==0){
                j = i;
                break;
            }
        }
        
        for (int i = j + 1; i < n;i++){
            if (arr[i] != 0){
                swap(j,i,arr);
                j++;
            }
        }
        
        for (int i = 0; i< n; i++){
            System.out.print(arr[i] + " ");
        }
    }
}

