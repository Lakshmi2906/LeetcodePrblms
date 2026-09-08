class Solution {
    public int maxArea(int[] height) {
        int area=0,maxa=0,h=0,w=0,left=0,right=height.length-1;
        while(left<right){
            h=Math.min(height[left],height[right]);
            w=right-left;
            area=h*w;
            maxa=Math.max(area,maxa);
            if(height[left]<height[right]) left++;
            else right--;
        }
        return maxa;
    }
}