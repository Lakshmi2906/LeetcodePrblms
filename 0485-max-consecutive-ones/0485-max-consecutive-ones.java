class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
       int maxc=0,left=0;
       for(int right=0;right<nums.length;right++){
        if(nums[right]==1) maxc=Math.max(maxc,right-left+1);
        else left=right+1;
       }
       return maxc;
    }
}