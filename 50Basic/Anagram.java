import java.util.*;

public class Anagram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.nextLine().trim().replaceAll("[\\s,]+", "").toLowerCase();
        String s2 = sc.nextLine().trim().replaceAll("[\\s,]+", "").toLowerCase();

        if (s1.length() != s2.length()) {
            System.out.println("NOT ANAGRAM");
            return;
        }

        char[] c1 = s1.toCharArray();
        char[] c2 = s2.toCharArray();
        
        for (int i = 0; i < c1.length - 1;i++){
            for (int j = 0; j < c1.length - i - 1;j++) {
                if (c1[j] > c1[j+1]){
                    char temp = c1[j];
                    c1[j] = c1[j+1];
                    c1[j+1] = temp;
                }
            }
        }

        for (int i = 0; i < c2.length -1 ;i++) {
            for (int j = 0; j < c2.length - i - 1; j++) {
                if (c2[j] > c2[j+1]){
                    char temp = c2[j];
                    c2[j] = c2[j+1];
                    c2[j+1] = temp;
                }
            }
        }

        boolean match = true;
        for (int i = 0; i < c1.length; i++) {
            if (c1[i] != c2[i]){
                match = false;
                break;
            }
        }

        System.out.println(match ? "Anagram" : "NOT Anagram");

    }
}


// import java.util.*;

// class Anagram{
//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);
//         String s1 = sc.nextLine();
//         String s2 = sc.nextLine();
        
//         s1 = sc.nextLine().trim().replaceAll("[\\s,]+","").toLowerCase();
//         s2 = sc.nextLine().trim().replaceAll("[\\s,]+","").toLowerCase();
// \
        
//         if(s1.length() != s2.length()){
//             System.out.println("False");
//             return;
//         }
        
//         char[] c1 = s1.toCharArray();
//         char[] c2 = s2.toCharArray();
        
        
//         Arrays.sort(c1);
//         Arrays.sort(c2);
        
//         if (Arrays.equals(c1,c2)){
//             System.out.println("True");
//         }else {
//             System.out.println("False");
//         }
//         sc.close();

        //or

        // int[] freq = new int[256];
        
        // for (int i = 0; i < s1.length();i++){
        //     freq[s1.charAt(i) - 'a']++;
        //     freq[s2.charAt(i) - 'a']--;
        // }
        
        // for (int x : freq){
        //     if (x != 0){
        //         System.out.print("False");
        //         return;
        //     }
            
        // }
        // System.out.print("True");
//     }
    
// }




