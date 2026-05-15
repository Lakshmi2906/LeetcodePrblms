class Solution {
    public int maxProduct(int[] nums) {
        int currmax=nums[0],currmin=nums[0],maxprod=nums[0];
        for(int i=1;i<nums.length;i++){
            int temp=currmax;
            currmax=Math.max(nums[i],Math.max(currmax*nums[i],currmin*nums[i]));
            currmin=Math.min(nums[i],Math.min(temp*nums[i],currmin*nums[i]));
            maxprod=Math.max(currmax,maxprod);
        }
        return maxprod;
    }
}