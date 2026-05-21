class Solution {
    public int longestOnes(int[] nums, int k) {
        int max_ans=0,n=nums.length,l=0,cnt=0;
		for(int r=0;r<n;r++){
            if(nums[r]==0){
                cnt++;
            }
            while(cnt>k){
                if(nums[l]==0){
                    cnt--;
                }
                l++;
            }
            max_ans=Math.max(max_ans,r-l+1);
        }
        return max_ans;
    }
}