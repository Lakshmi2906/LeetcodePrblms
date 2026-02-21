class Solution {
    public int trap(int[] height) {
        int left=0;
        int n=height.length;
        int right=n-1;
        int lb=0,rb=0;
        int res=0;
        while(left<=right){
            if(height[left]<=height[right]){
                if(height[left]>=lb) lb=height[left];
                else res+=(lb-height[left]);
                left++;
            }
            else{
                if(height[right]>rb) rb=height[right];
                else res+=(rb-height[right]);
                right--;
            }
        }
        return res;
    }
}