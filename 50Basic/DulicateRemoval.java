import java.util.*;

class DulicateRemoval {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine().trim();
        int n = s.length();
        char[] arr = s.toCharArray();
        
        List<Integer> result = new ArrayList<>();
        int l = 0;
        int r = 1;
        result.add(arr[l] - '0');
        while (r < n){
            if ((arr[l] - '0') != (arr[r] - '0')){
                result.add(arr[r] - '0');
            }
            l++;
            r++;
        }
        for (int i = 0 ; i < result.size(); i++ ){
            System.out.print(result.get(i));
        }
    }
}



// import java.util.*;

// class Main {
//     public static String removeDuplicate(String s) {
//         if (s.length() == 0) return "";
        
//         StringBuilder result = new StringBuilder();
        
//         result.append(s.charAt(0));
        
//         for (int i = 1; i < s.length() ; i++){
//             if (s.charAt(i) != s.charAt(i-1)){
//                 result.append(s.charAt(i));
//             }
//         }
        
//         return result.toString();
//     }
    
//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);
        
//         String s = sc.nextLine().trim();
        
//         String answer = removeDuplicate(s);
        
//         System.out.print(answer);
//     }
// }

