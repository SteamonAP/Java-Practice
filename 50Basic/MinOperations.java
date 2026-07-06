import java.util.*;

class MinOperations {
    
    public static int minOperations(int p, int q, int r) {
        // if (p == q && q == r){
        //     return 0;
        // }
        
        // List<Integer> list = new ArrayList<>();
        // list.add(p);
        // list.add(q);
        // list.add(r);
        
        // Collections.sort(list);
        // int step = 0;
        // while (true) {
        //     list.set(0, list.get(0) + 1);
        //     list.set(1, list.get(1) + 1);
        //     list.set(2, list.get(2) - 1);
        //     step++;
        //     if (list.get(0).equals(list.get(1)) && list.get(1).equals(list.get(2))){
        //         return step;
        //     }
        //     Collections.sort(list);
        //     if ((list.get(0).equals(list.get(1)) && list.get(1) + 1 == list.get(2))
        //     || (list.get(1).equals(list.get(2)) && list.get(0) + 1 == list.get(1))){
        //         return -1;
        //     }
        // }
        
        int[] arr = {p,q,r};
        Arrays.sort(arr);
        
        p = arr[0];
        q = arr[1];
        r = arr[2];
        
        if (p != q) {
            return -1;
        }
        
        int diff = r - p;
        
        if (diff % 2 != 0) {
            return -1;
        }
        
        return diff / 2;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine().trim());
        while (n-- > 0) {
            int p = sc.nextInt();
            int q = sc.nextInt();
            int r = sc.nextInt();
            int ans = minOperations(p,q,r);
            System.out.print(ans + " ");
        }
        sc.close();
    }
}