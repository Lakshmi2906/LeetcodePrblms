class Solution {
    public long maximumSubarraySum(int[] nums, int k) {
       long sum=0,maxs=0;
       int l=0;
       HashSet<Integer> hs=new HashSet<>();
       for(int r=0;r<nums.length;r++){
        while(hs.contains(nums[r]) || r-l+1>k){
            sum-=nums[l];
            hs.remove(nums[l]);
            l++;
        }
        hs.add(nums[r]);
        sum+=nums[r];
        if(hs.size()==k){
            maxs=Math.max(sum,maxs);
        }
       }
       return maxs;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna