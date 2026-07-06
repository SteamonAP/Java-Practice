import java.util.*;

public class SecLrg {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = Integer.parseInt(sc.nextLine().trim());

        String[] arrStr = sc.nextLine().trim().split("[\\s,]+");
        
        int largest = Integer.MIN_VALUE;
        int secLargest = Integer.MIN_VALUE;

        for (int i = 0; i < N; i++) {
            int num = Integer.parseInt(arrStr[i]);
            if (num > largest) {
                secLargest = largest;
                largest = num;
            } else if (num > secLargest && num != largest) {
                secLargest = num;
            }
        }

        if (secLargest == Integer.MIN_VALUE)
            System.out.println(-1);
        else
            System.out.println(secLargest);            
    }
}
