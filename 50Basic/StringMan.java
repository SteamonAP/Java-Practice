import java.util.*;

public class StringMan {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
    
        String s = sc.nextLine().trim();
        
        HashMap<Character,Integer> map = new HashMap<>();
        
        
        
        for (char ch : s.toCharArray()){
            map.put(ch , map.getOrDefault(ch , 0) + 1);
        }
        
        Character first_NonRP = null;
        Character first_RP = null;
        int max = Integer.MIN_VALUE;
        for (char key : s.toCharArray()) {
            if (map.get(key) == 1) {
                first_NonRP = key;
                break;
            }
        }
        
        for (char key : map.keySet()){
            if (map.get(key) > max){
                max = map.get(key);
                first_RP = key;
            }
        }
        
        if (first_NonRP ==null){
            System.out.println("None " + first_RP);
        } else {
            System.out.println(first_NonRP + " " + first_RP);
        }
    }
    
    
}