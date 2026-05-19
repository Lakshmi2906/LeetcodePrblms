class Solution {
    public int trap(int[] height) {
       int left=0,right=height.length-1,l_max=height[left],r_max=height[right],water=0;
       while(left<right){
        if(l_max < r_max){
            left++;
            l_max=Math.max(l_max,height[left]);
            water+= l_max-height[left];
        }
        else{
            right--;
            r_max=Math.max(r_max,height[right]);
            water+=r_max-height[right];
        }
       }
       return water;
    }
}