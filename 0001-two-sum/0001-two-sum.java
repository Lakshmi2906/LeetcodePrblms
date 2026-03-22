class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            int sno=target-nums[i];
            if(map.containsKey(sno)){
                return new int[]{map.get(sno),i};
            }
            map.put(nums[i],i);
        }
        return new int[]{};
    }
}