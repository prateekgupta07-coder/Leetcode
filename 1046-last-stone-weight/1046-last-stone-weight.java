class Solution {
    public int lastStoneWeight(int[] stones) {
        int n = stones.length;

        while (n > 1) {
            Arrays.sort(stones, 0, n);

            int x = stones[n - 2];
            int y = stones[n - 1];

            n--;

            if (x != y) {
                stones[n - 1] = y - x;
            } else {
                n--;
            }
        }

        if (n == 0)
            return 0;

        return stones[0];
    }
}