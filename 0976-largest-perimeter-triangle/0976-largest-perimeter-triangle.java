
import java.util.Arrays;

class Solution {
    public int largestPerimeter(int[] nums) {
        int a = nums.length;
        Arrays.sort(nums);

        for (int i = a - 1; i >= 2; i--) {
            if (nums[i - 2] + nums[i - 1] > nums[i]) {
                return nums[i - 2] + nums[i - 1] + nums[i];
            }
        }

        return 0;
    }
}
