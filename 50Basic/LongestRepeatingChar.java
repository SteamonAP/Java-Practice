import java.util.*;

class LongestRepeatingChar {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s1 = sc.nextLine().trim();
        s1 = s1.replaceAll("[^a-zA-Z0-9]","");
        int n = s1.length();
        int K = Integer.parseInt(sc.nextLine().trim());
        
        HashMap<Character,Integer> mpp = new HashMap<>();
        
        int l = 0;
        int h = 0;
        int maxFreq = 0;
        int maxLen = 0;
        
        while(h < n){
            mpp.put(s1.charAt(h),mpp.getOrDefault(s1.charAt(h),0)+1);
            maxFreq = Math.max(maxFreq,mpp.get(s1.charAt(h)));
            while((h-l+1)-maxFreq > K){
                mpp.put(s1.charAt(l),mpp.get(s1.charAt(l))-1);
                if(mpp.get(s1.charAt(l)) == 0){
                    mpp.remove(s1.charAt(l));
                }
                l++;
            }
            maxLen = Math.max(maxLen,(h-l+1));
            h++;
        }
        
        System.out.print(maxLen);
        
        
    }
}