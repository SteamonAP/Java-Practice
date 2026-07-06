import java.util.*;

class Vowels {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        String input = sc.nextLine().toLowerCase();
        
        int vowels = 0;
        int consonents = 0;
        int spaces = 0;
        
        for (char c : input.toCharArray()){
            if(c == 'a' || c == 'e' || c == 'i'||c == 'o'|| c == 'u'){
                vowels++;
            }else if (Character.isLetter(c)){
                consonents++;
            }else if(Character.isWhitespace(c)){
                spaces++;
            }
        }
        System.out.println("Vowels: " + vowels);
        System.out.println("Consonents: " + consonents);
        System.out.println("spaces: " + spaces);
        
        
    }
}


// import java.util.*;

// class ASCCI {
//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);
        
//         String s = sc.nextLine();
        
//         int n = s.length();
//         StringBuilder sb = new StringBuilder();
//         String vowels = "aeiouAEIOU";
//         for (char c : s.toCharArray()){
//             if(vowels.indexOf(c) == -1){
//                 sb.append(c);
//             }
//         }
//         System.out.print(sb);
        
//     }
// }

