class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        int n=nums.length,idx=0;
        int[] ans=new int[n-k+1];
         Deque<Integer> d=new LinkedList<>();
         for(int r=0;r<n;r++){
            while(!d.isEmpty() && nums[d.peekLast()]<nums[r]){
                d.pollLast();
            }
            while(!d.isEmpty() && d.peekFirst()<=r-k){
                d.pollFirst();
            }
            d.offerLast(r);
            if(r>=k-1){
                ans[idx++]=nums[d.peekFirst()];
            }
         }
        return ans;
    }
}