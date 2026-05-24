class Solution {
    public int pivotIndex(int[] nums) {
        int n=nums.length;
        for(int i=0;i<n;i++){
            int lsum=0,rsum=0;
            for(int k=0;k<i;k++){
                lsum+=nums[k];
            }
            for(int j=i+1;j<n;j++){
                rsum+=nums[j];
            }
            if(lsum==rsum){
                return i;
            }
        }
        return -1;
    }
}