class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int cnt=0,maxcnt=0;
        int l=0;
        for(int r=0;r<nums.length;r++){
           if(nums[r]==0){
            l=r+1;
           }
           else{
            cnt=r-l+1;
            maxcnt=Math.max(cnt,maxcnt);
           }
        }
        return maxcnt;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna