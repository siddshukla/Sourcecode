import java.util.*;

class CoinChange {

    static int countWays(int coins[], int n, int sum) {

        if (sum == 0)
            return 1;

        if (sum < 0)
            return 0;

        if (n <= 0)
            return 0;

        return countWays(coins, n - 1, sum) + countWays(coins, n, sum - coins[n - 1]);
    }

    public static void main(String args[]) {
        int coins[] = { 1, 2, 3 };
        int n = coins.length;

        System.out.println(countWays(coins, n, 5));
    }
}
