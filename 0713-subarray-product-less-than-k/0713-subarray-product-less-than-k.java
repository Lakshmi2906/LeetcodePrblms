class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        int cnt=0,l=0,n=nums.length,prod=1;
        if(k<=1) return 0;
        for(int r=0;r<n;r++){
            prod*=nums[r];
            while(prod>=k){
                prod/=nums[l];
                l++;
            }
            cnt+=r-l+1;
        }
        return cnt;
    }
}