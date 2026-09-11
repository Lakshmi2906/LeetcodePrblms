class Solution {
    public int longestOnes(int[] nums, int k) {
      int maxw=0;
      for(int i=0;i<nums.length;i++){
        int cntz=0;
        for(int j=i;j<nums.length;j++){
            if(nums[j]==0) cntz++;
            if(cntz>k) break;
             maxw=Math.max(maxw,j-i+1);
        }
      } 
      return maxw; 
    }
}