class Solution {
    public int[] runningSum(int[] nums) {
        int sum=nums[0];
        int ans[]=new int[nums.length];
        ans[0]=sum;
        for(int i=1;i<nums.length;i++){
            sum+=nums[i];
            ans[i]=sum;
        }
        return ans;
    }
}