class Solution {
    public int maxSubArray(int[] nums) {
        int maxS=nums[0],sum=0;
        for(int num:nums){
            sum+=num;
            maxS=Math.max(sum,maxS);
            if(sum<0) sum=0;
        }
        return maxS;
    }
}