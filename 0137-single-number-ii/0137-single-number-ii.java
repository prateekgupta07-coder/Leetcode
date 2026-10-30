class Solution {
    public int singleNumber(int[] nums) {
        Arrays.sort(nums);
        int x = nums.length;
        for(int i=0; i<x - 2; i+=3){
            if(nums[i] != nums[i+1]){
                return nums[i];
            }
        }
        return nums[x - 1];
    }
}