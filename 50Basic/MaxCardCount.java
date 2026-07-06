import java.util.*;

public class MaxCardCount {
    public static void main(String[] args) {
        // IF ORDER IS NOT FIXED

        // Scanner sc = new Scanner(System.in);
        // int n = sc.nextInt();
        // int[] cards = new int[n];

        // for (int i = 0; i < n; i++){
        // cards[i] = sc.nextInt();
        // }

        // Arrays.sort(cards);

        // int sum = 0;
        // int count = 0;

        // for (int i = n -1; i >= 0;i--) {
        // if (sum + cards[i] >= 0){
        // sum += cards[i];
        // count++;
        // }
        // }

        // System.err.println(count);

        // IF THE ORDER SHALL BE FIXED

        int[] cards = { 4, -5, -3, 6 };

        int result = maxCards(cards);

        System.out.println(result);
    }

    public static int maxCards(int[] cards) {
        long sum = 0;
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();

        for (int card : cards) {
            sum += card;

            minHeap.add(card);

            if (sum < 0) {
                sum -= minHeap.poll();
            }
        }
        return minHeap.size();
    }
}
