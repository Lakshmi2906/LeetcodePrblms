class Solution {
    public int longestOnes(int[] nums, int k) {
        int l=0,maxcnt=0,cnt=0;
        for(int r=0;r<nums.length;r++){
            if(nums[r]==0){
                cnt++;
            }
            while(cnt>k){
                if(nums[l]==0) cnt--;
                l++;
            }
            maxcnt=Math.max(maxcnt,r-l+1);
        }
        return maxcnt;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna