class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int con=0,maxc=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==1){
                con++;
            }
            else{
                maxc=Math.max(maxc,con);
                con=0;
            }
        }
        maxc=Math.max(maxc,con);
        return maxc;
    }
}