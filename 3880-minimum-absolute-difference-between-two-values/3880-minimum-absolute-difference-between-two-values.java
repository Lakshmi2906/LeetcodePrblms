class Solution {
    public int minAbsoluteDifference(int[] nums) {
        int min=Integer.MAX_VALUE,ans=0;
        for(int i=0;i<nums.length;i++){
            for(int j=0;j<nums.length;j++){
                if(nums[i]==1 && nums[j]==2){
                    ans=abs(i-j);
                    if(ans<min){
                        min=ans;
                    }
                }
            }
        }
        if(min==Integer.MAX_VALUE) return -1;
        return min;
    }
        public int abs(int i){
            if(i<0) return -i;
            else return i;
        }
}