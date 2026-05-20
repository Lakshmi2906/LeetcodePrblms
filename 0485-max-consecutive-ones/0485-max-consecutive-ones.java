class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int r=0,cnt=0,maxi=0;
        while(r<nums.length){
            if(nums[r]==1){
                cnt++;
            }
            else{
                maxi=Math.max(cnt,maxi);
                cnt=0;
            }
            r++;
        }
        return Math.max(cnt,maxi);
    }
}