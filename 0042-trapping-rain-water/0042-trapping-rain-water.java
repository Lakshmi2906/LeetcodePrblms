class Solution {
    public int trap(int[] height) {
        int tw=0,n=height.length,l=0,r=n-1,lmax=height[l],rmax=height[r];
        while(l<r){
            if(lmax<rmax){
                l++;
                lmax=Math.max(lmax,height[l]);
                tw+=lmax-height[l];
            }
            else{
                r--;
                rmax=Math.max(rmax,height[r]);
                tw+=rmax-height[r];
            }
        }
        return tw;
    }
}