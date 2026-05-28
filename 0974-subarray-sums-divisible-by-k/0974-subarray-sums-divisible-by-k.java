class Solution {
    public int subarraysDivByK(int[] nums, int k) {
        int cnt=0,sum=0;
        HashMap<Integer,Integer> hm=new HashMap<>();
        hm.put(0,1);
        for(int num:nums){
            sum+=num;
            int rem=((sum%k)+k)%k;
            cnt+=hm.getOrDefault(rem,0);
            hm.put(rem,hm.getOrDefault(rem,0)+1);
        }
        return cnt;
    }
}