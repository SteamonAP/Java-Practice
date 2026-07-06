import java.util.*;

class OddSum{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        String line = sc.nextLine().trim();
        line = line.replaceAll("[\\[\\]{}()]", "");
        String[] vals = line.split("[\\s,]+");

        int n = Integer.parseInt(vals[0]);

        int[] arr = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = Integer.parseInt(vals[i + 1]);
        }

        int sum = 0;
        int count = 0;

        for(int i = 0; i < n; i++){
            if(arr[i] % 2 != 0){
                sum += arr[i];
                count++;
            }
        }

        float avg = (count == 0) ? 0 : (float) sum / count;

        System.out.print(sum + " " + count + " ");
        System.out.printf("%.2f", avg);
    }
}