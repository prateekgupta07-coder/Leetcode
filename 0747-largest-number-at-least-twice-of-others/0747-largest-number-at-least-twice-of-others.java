class Solution {
    public int dominantIndex(int[] nums) {
        int max = 0;
        int idx = 0;
        for(int i=0;i<nums.length;i++)
            {
                if(nums[i]>max)
                {
                    max=nums[i];
                    idx=i;
                }
            }
        for(int i=0;i<nums.length;i++)
            {
                if(i==idx)continue;
                if(max<2*nums[i])return -1;
            }
        return idx;
    }
}
