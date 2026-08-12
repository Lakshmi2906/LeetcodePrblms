class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int n=nums1.length,k=n-1;
        int[] ans=new int[10001];
        Stack<Integer> st=new Stack<>();
        for(int i=nums2.length-1;i>=0;i--){
            int elem=nums2[i];
            while(!st.isEmpty() && st.peek()<=nums2[i]){
                st.pop();
            }
            ans[elem]=st.isEmpty() ? -1 :st.peek();
            if(st.isEmpty()){
                ans[elem]=-1;
            }
            else{
                ans[elem]=st.peek();
            }
            st.push(elem);
        }
        for(int i=0;i<nums1.length;i++){
            nums1[i]=ans[nums1[i]];
        }
        return nums1;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna