class Solution {
    public int rob(int[] nums) {
        int a = 0;
        int b = 0;
        int sum;

        for (int i = 0; i < nums.length; i++) {
            if (a + nums[i] > b)
                sum = a + nums[i];
            else
                sum = b;

            a = b;
            b = sum;
        }

        return b;
    }
}