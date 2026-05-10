class Solution {
    public int[] nextGreaterElements(int[] nums) {
        Stack<Integer> st=new Stack<>();
        int n=nums.length;
          int[] ans=new int[n];
        for(int i=2*n-1;i>=0;i--){
            int num=nums[i%n];
            while(!st.empty() && st.peek()<= num){
                st.pop();
            }
            if(i<n){
                ans[i]=st.empty()?-1:st.peek();
            }
            st.push(num);
        }
        return ans;
    }
}