class Solution {
    public boolean checkSubarraySum(int[] nums, int k) {
        HashMap<Integer,Integer> hm=new HashMap<>();
        int psum=0,n=nums.length,rem=0;
        hm.put(0,-1);
        for(int i=0;i<n;i++){
            psum+=nums[i];
            rem=psum%k;
            if(hm.containsKey(rem)){
                if(i-hm.get(rem) >= 2){
                    return true;
                }
            }
             else{
                hm.put(rem,i);
            }
        }
        return false;
    }
}