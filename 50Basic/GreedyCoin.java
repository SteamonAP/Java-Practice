import java.util.*;

public class GreedyCoin {
    public static void main(String[] args) {
        int[] coins = { 25, 10, 5, 1 };
        Scanner sc = new Scanner(System.in);
        int amount = sc.nextInt();

        int count = 0;

        for (int coin : coins) {
            count += amount / coin;
            amount = amount % coin;
        }

        System.out.println(count);
    }

}
