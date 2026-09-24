class Solution {
    public int findNumbers(int[] nums) {
        int c=0,n=nums.length;
        for(int i=0;i<n;i++){
            int len=0;
            while(nums[i]!=0){
                int digit=nums[i]%10;
                len++;
                nums[i]/=10;
            }
            if(len%2==0){
                c++;
            }
        }
        return c;
    }
}