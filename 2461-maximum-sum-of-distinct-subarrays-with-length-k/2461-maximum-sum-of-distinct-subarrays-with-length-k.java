class Solution {
    public long maximumSubarraySum(int[] nums, int k) {
        long sum=0,maxs=0;
        int left=0;
        HashSet<Integer> hs=new HashSet<>();
        for(int right=0;right<=nums.length-1;right++){
            while(hs.contains(nums[right]) || right-left+1>k){
                sum-=nums[left];
                hs.remove(nums[left]);
                left++;
            }
            hs.add(nums[right]);
            sum+=nums[right];
            if(hs.size()==k){
                maxs=Math.max(maxs,sum);
            }
        }
        return maxs;
    }
}