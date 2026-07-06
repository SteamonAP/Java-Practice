import java.util.*;


class CountArrangement {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine().trim());
        int r = Integer.parseInt(sc.nextLine().trim());
        int end = Integer.parseInt(sc.nextLine().trim());
        
        int result = count(1,1,n,r,end);
        System.out.print(result);
    }
    
    public static int count(int pos,int last,int n,int r,int end){
        if(pos==n){
            return (last==end) ? 1 : 0;
        }
        
        int total = 0;
        for(int i = 1; i <= r;i++){
            if(last != i){
                total += count(pos+1,i,n,r,end);
            }
        }
        return total;
    }
}