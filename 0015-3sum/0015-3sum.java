class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
       List<List<Integer>> ls=new ArrayList<>();
       int n=nums.length;
       Arrays.sort(nums);
       for(int i=0;i<n-2;i++){
        if(i>0 && nums[i]==nums[i-1]) continue;
        int l=i+1,r=n-1;
        while(l<r){
            int sum=nums[l]+nums[r]+nums[i];
            if(sum==0){
                ls.add(Arrays.asList(nums[i],nums[l],nums[r]));
                while(l<r && nums[l]==nums[l+1]) l++;
                while(l<r && nums[r]==nums[r-1]) r--;
                l++;
                r--;
            }
            else if(sum<0){
                l++;
            }
            else r--;
        }
       }
       return ls;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna