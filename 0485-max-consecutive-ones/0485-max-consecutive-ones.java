class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int cnt=0,maxcnt=Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==1) cnt++;
            if(nums[i]==0){
                cnt=0;
            }
            maxcnt=Math.max(cnt,maxcnt);
        }
        return Math.max(cnt,maxcnt);
    }
}