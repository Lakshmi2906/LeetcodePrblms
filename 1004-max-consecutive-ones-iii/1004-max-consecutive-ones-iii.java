class Solution {
    public int longestOnes(int[] nums, int k) {
        int max_ans=0,n=nums.length;
		for(int l=0;l<n;l++){
            int cnt=0;
		    for(int r=l;r<n;r++){
		        if(nums[r]==0){
		            cnt++;
		        }
		        if(cnt>k){
		            break;
		        }
                max_ans=Math.max(max_ans,r-l+1);
		    }
		}
        return max_ans;
    }
}