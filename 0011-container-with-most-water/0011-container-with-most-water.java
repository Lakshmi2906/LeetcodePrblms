class Solution {
    public int maxArea(int[] height) {
        int h=0,w=0,area=0,n=height.length,maxarea=Integer.MIN_VALUE,l=0,r=n-1;
        while(l<r){
            h=Math.min(height[l],height[r]);
            w=r-l;
            area=h*w;
            maxarea=Math.max(area,maxarea);
           if(height[l]<=height[r]) l++;
           else r--;
        }
        
        return maxarea;
    }
}