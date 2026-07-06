import java.util.*;

class LongestSubmatrixWithSum0{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        String[] dims = sc.nextLine().trim().split("\\s+");
        int m = Integer.parseInt(dims[0]);
        int n = Integer.parseInt(dims[1]);
        
        int[][] mat = new int[m][n];
        
        for(int i = 0; i < m;i++){
            String line = sc.nextLine().trim();
            line = line.replaceAll("[\\[\\]{}()]","");
            String[] vals = line.split("[\\s,]+");
            
            for (int j = 0; j < n;j++){
                mat[i][j] = Integer.parseInt(vals[j]);
            }
        }
        int result = largestZeroSumSubmatrix(mat,m,n);
        System.out.print(result);
    }
    
    public static int largestLength(int[] arr){
        int n = arr.length;
        int preSum = 0;
        int maxi = 0;
        Map<Integer,Integer> mpp = new HashMap<>();
        
        for (int i = 0; i < n; i++){
            preSum += arr[i];
            
            if (preSum==0){
                maxi = i + 1;
            }else if(mpp.containsKey(preSum)){
                maxi = Math.max(maxi, i - mpp.get(preSum));
            }else {
                mpp.put(preSum,i);
            }
        }
        return maxi;
    }
    
    public static int largestZeroSumSubmatrix(int[][] mat, int m, int n){
        int maxArea = 0;
        for (int i = 0; i < m; i++){
            int[] temp = new int[n];
            for(int j = i; j < m;j++){
                for (int c = 0; c < n;c++){
                    temp[c] += mat[j][c];
                }
                int length = largestLength(temp);
                int width = j - i + 1;
                maxArea = Math.max(maxArea, length * width);
            }
        }
        return maxArea;
    }
}