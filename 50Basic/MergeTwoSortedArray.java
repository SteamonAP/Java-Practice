import java.util.*;

class MergeTwoSortedArray {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int n = Integer.parseInt(sc.nextLine().trim());
        String[] vals1 = sc.nextLine().trim().split("[\\s,]+");
        
        int m = Integer.parseInt(sc.nextLine().trim());
        String[] vals2 = sc.nextLine().trim().split("[\\s,]+");
        
        int[] a = new int[n];
        int[] b = new int[m];
        
        for (int i = 0; i < n; i++){
            a[i] = Integer.parseInt(vals1[i]);
        }
        for (int i = 0; i < m; i++){
            b[i] = Integer.parseInt(vals2[i]);
        }
        
        ArrayList<Integer> answer = merge(a,b);
        
        for (int x : answer){
            System.out.print(x + " ");
        }
    }
    
    public static ArrayList<Integer> merge (int[] a, int[] b) {
        ArrayList<Integer> result = new ArrayList<>();
        
        int i = 0;
        int j = 0;
        
        while (i < a.length && j < b.length){
            if (a[i] <= b[j]){
                result.add(a[i]);
                i++;
            }else{
                result.add(b[j]);
                j++;
            }
        }
        
        while (i < a.length){
            result.add(a[i]);
            i++;
        }
        while(j < b.length){
            result.add(b[j]);
            j++;
        }
        
        return result;
    }
}