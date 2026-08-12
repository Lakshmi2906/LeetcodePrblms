class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        
        int n=nums1.length,k=0;
        int[] ans=new int[n];
        ans[n-1]=-1;
        for(int i=0;i<n;i++){
            int target=nums1[i];
            int nextG=-1;
            boolean found=false;
            for(int j=0;j<nums2.length;j++){
                if(nums2[j]==target){
                    found=true;
                }
                if(found && nums2[j]>target){
                    nextG=nums2[j];
                    break;
                }
            }
            ans[i]=nextG;
        }
        return ans;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna