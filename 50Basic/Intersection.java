import java.util.*;

class Intersection {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int n = Integer.parseInt(sc.nextLine().trim());
        String[] vals1 = sc.nextLine().trim().split("[\\s,]+");
        int m = Integer.parseInt(sc.nextLine().trim());
        String[] vals2 = sc.nextLine().trim().split("[\\s,]+");
        
        int[] a = new int[n];
        int[] b = new int[m];
        for (int i = 0; i < n;i++){
            a[i] = Integer.parseInt(vals1[i]);
        }
        for (int i = 0; i < m; i++){
            b[i] = Integer.parseInt(vals2[i]);
        }
        
        Arrays.sort(a);
        Arrays.sort(b);
        
        ArrayList<Integer> result = intersection(a,b);
        
        for (int x : result){
            System.out.print(x + " ");
        }
    }
    
    public static ArrayList<Integer> intersection(int[] a, int[] b){
        ArrayList<Integer> result = new ArrayList<>();
        
        int i = 0;
        int j = 0;
        
        while (i < a.length && j < b.length){
            if (a[i] < b[j]){
                i++;
            }else if (a[i] > b[j]){
                j++;
            } else {
                if (result.isEmpty() || result.get(result.size() - 1) != a[i]){
                    result.add(a[i]);
                }
                i++;
                j++;
            }
            
        }
        
        return result;
        
    }
}