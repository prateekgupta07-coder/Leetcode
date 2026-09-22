class Solution {
    public int distributeCandies(int[] nums) {
        int a = 0;
        int x = nums.length;

        for (int i = 0; i < x; i++) {
            boolean b = true;

            for (int j = 0; j < i; j++) {
                if (nums[i] == nums[j]) {
                    b = false;
                    break;
                }
            }

            if (b)
                a++;
        }

        if (a > x / 2)
            a = x / 2;

        return a;
    }
}