import java.util.*;

public class sLargeAndsSmall {
    public static List<Integer> getSecondOrderElements(int n, List<Integer> a){
        int sLargest = getsLargest(a, n);
        int sSmallest = getsSmallest(a, n);
        
        List<Integer> result = new ArrayList<>();
        result.add(sLargest);
        result.add(sSmallest);
        return result;
    }


    public static int getsLargest(List<Integer> a, int n) {
        int largest = a.get(0);
        int sLargest = Integer.MIN_VALUE;

        for (int i = 1 ; i < n ; i ++){
            if (a.get(i) > largest) {
                sLargest = largest;
                largest = a.get(i);
            } else if (a.get(i) < largest && a.get(i) > sLargest) {
                sLargest = a.get(i);
            }
        }

        return sLargest;

    }

    public static int getsSmallest(List<Integer> a, int n){
        int smallest = a.get(0);
        int sSmallest = Integer.MAX_VALUE;

        for (int i = 1; i < n; i++){
            if (a.get(i) < smallest) {
                sSmallest = smallest;
                smallest = a.get(i);
            } else if (a.get(i) > smallest && a.get(i) < sSmallest) {
                sSmallest = a.get(i);
            }
        }

        return sSmallest;
    }



    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < n ; i++) {
            list.add(sc.nextInt());
        }

        List<Integer> ans = getSecondOrderElements(n, list);

        System.out.println("Second Largest: " + ans.get(0));
        System.out.println("Second Smallest: " + ans.get(1));

        sc.close();

    }
}
