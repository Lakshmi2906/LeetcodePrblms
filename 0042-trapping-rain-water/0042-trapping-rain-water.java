class Solution {
    public int trap(int[] height) {
        int tw=0,lmax=0,rmax=0,left=0,right=height.length-1;
        while(left<right){
            lmax=Math.max(lmax,height[left]);
            rmax=Math.max(rmax,height[right]);
           if(height[left]<height[right]){
            tw+=lmax-height[left];
            left++;
           }
           else{
            tw+=rmax-height[right];
            right--;
           }
        }
        return tw;
    }
}