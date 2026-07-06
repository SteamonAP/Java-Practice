import java.util.*;

class NumberOfSubStringwithABC {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s1 = sc.nextLine().trim();
        s1 = s1.replaceAll("[^a-zA-Z0-9]","");
        int n = s1.length();
        
        int[] lastSeen = {-1,-1,-1};
        
        int count = 0;
        
        for(int i = 0; i < n; i++){
            lastSeen[s1.charAt(i) - 'a'] = i;
            if(lastSeen[0] != -1 && lastSeen[1] != -1 && lastSeen[2] != -1){
                count += 1 + Math.min(lastSeen[0],Math.min(lastSeen[1],lastSeen[2]));
            }
        }
        
        System.out.print(count);
        
        
    }
}