import java.util.*;

class CountGreatElementsFromLeft {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int n = Integer.parseInt(sc.nextLine().trim());
        String arrLine = sc.nextLine().trim();
        arrLine = arrLine.replaceAll("[\\[\\]{}()]","");
        String[] vals = arrLine.split("[\\s,]+");
        int[] arr = new int[n];
        for(int i = 0 ; i < n ; i++){
            arr[i] = Integer.parseInt(vals[i]);
        }
        
        int max = Integer.MIN_VALUE;
        int count = 0;
        
        for (int i = 0 ;i < n; i++){
            if(arr[i] > max){
                max = arr[i];
                count++;
            }
        }
        
        System.out.print(count);
    }
}