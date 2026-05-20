class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int r=0,l=0,cnt=0;
        while(r<nums.length){
            if(nums[r]==1){
                cnt=Math.max(cnt,r-l+1);
            }
            else{
                l=r+1;
            }
            r++;
        }
        return cnt;
    }
}