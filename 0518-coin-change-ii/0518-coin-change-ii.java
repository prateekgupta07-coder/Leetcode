class Solution {
    public int change(int amount, int[] coins) {
        int[] x = new int[amount + 1];
        x[0] = 1;

        for (int i = 0; i < coins.length; i++) {
            for (int j = coins[i]; j <= amount; j++) {
                x[j] = x[j] + x[j - coins[i]];
            }
        }

        return x[amount];
    }
}