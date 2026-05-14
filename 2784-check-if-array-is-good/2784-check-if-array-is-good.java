class Solution {
    public boolean isGood(int[] nums) {
        int[] freq=new int[nums.length+1];
        int n=nums.length;
        for(int num:nums){
            if(num>=n) return false;
            freq[num]++;
        }
        for(int i=1;i<n-1;i++){
            if(freq[i]!=1) return false;
        }
        return freq[n-1]==2;
    }
}