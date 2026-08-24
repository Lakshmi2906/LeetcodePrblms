class Solution {
    public void sortColors(int[] nums) {
        int cntz=0,cnto=0,cntt=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0) cntz++;
            else if(nums[i]==1) cnto++;
            else cntt++;
        }
        for(int i=0;i<nums.length;i++){
            if(i<cntz){
                nums[i]=0;
            }
            else if(i<cntz+cnto){
                nums[i]=1;
            }
            else if(i<cntz+cnto+cntt){
                nums[i]=2; 
        }
      }
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna