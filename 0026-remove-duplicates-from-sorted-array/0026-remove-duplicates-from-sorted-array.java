class Solution {
    public int removeDuplicates(int[] nums) {
        int ins=0;
        for(int i=0;i<nums.length;i++){
            if(nums[ins]!=nums[i]){
                nums[ins+1]=nums[i];
                ins++;
            }
        }
        return ins+1;
    }
}