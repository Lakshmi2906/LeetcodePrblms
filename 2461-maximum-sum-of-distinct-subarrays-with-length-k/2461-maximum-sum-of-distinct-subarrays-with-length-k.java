class Solution {
    public long maximumSubarraySum(int[] nums, int k) {
        long sum=0,maxs=0;
        int left=0;
        HashSet<Integer> hs=new HashSet<>();
        for(int right=0;right<nums.length;right++){
            while(hs.contains(nums[right])|| right-left+1 > k){
                hs.remove(nums[left]);
                sum-=nums[left];
                left++;
            }
            hs.add(nums[right]);
            sum+=nums[right];
            if(right-left+1==k){
                maxs=Math.max(maxs,sum);
            }
        }
        return maxs;
    }
}