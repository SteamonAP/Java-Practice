import java.util.*;

class CountMaxAinRange {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine().trim();
        int n = input.length();
        int L = Integer.parseInt(sc.nextLine().trim());
        int max = Integer.MIN_VALUE;
        for(int i = 0; i < n;i+=L){
            int count = 0;
            for (int j = i; j < Math.min(i+L,n);j++){
                if (input.charAt(j) == 'a'){
                    count++;
                }
            }
            max = Math.max(max, count);
        }
        
        System.out.print(max);
    }
}