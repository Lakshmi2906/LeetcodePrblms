class Solution {
    public int pivotIndex(int[] nums) {
        int n=nums.length,lsum=0,total=0;
        for(int num:nums){
            total+=num;
        }
        for(int i=0;i<n;i++){
            int rsum=0;
            rsum += total-lsum-nums[i];
            if(lsum==rsum){
                return i;
            }
            lsum+=nums[i];
        }
        return -1;
    }
}