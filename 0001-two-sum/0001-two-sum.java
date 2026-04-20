class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> hs=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            int search=target-nums[i];
            if(hs.containsKey(search)){
                return new int[]{hs.get(search),i};
            }
            hs.put(nums[i],i);
        }
        return new int[]{};
    }
}