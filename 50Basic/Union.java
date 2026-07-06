import java.util.*;

class Union {
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
        
        ArrayList<Integer> result = union(a,b);
        
        for (int x : result){
            System.out.print(x + " ");
        }
    }
    
    public static ArrayList<Integer> union(int[] a, int[] b){
        ArrayList<Integer> result = new ArrayList<>();
        
        int i = 0;
        int j = 0;
        
        while (i < a.length && j < b.length){
            if (i > 0 && a[i] == a[i-1]){
                i++;
                continue;
            }
            if (j > 0 && b[j] == b[j-1]){
                j++;
                continue;
            }
            
            if (a[i] < b[j]){
                result.add(a[i]);
                i++;
            }else if (a[i] > b[j]){
                result.add(b[j]);
                j++;
            } else {
                result.add(a[i]);
                i++;
                j++;
            }
        }
        
        while (i < a.length){
            if (i == 0 || a[i] != a[i-1]){
                result.add(a[i]);
            }
            i++;
        }
        
        while (j < b.length){
            if (j == 0 || b[j] != b[j-1]){
                result.add(b[j]);
            }
            j++;
        }
        
        return result;
    }
}