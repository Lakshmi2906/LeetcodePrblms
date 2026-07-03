class Solution {
    public int shipWithinDays(int[] weights, int days) {
        int low=0,high=0;
        for(int w:weights){
            low=Math.max(low,w);
            high+=w;
        }
        int ans=0;
        while(low<=high){
            int k=low+(high-low)/2;
            if(canShip(weights,k,days)){
                ans=k;
                high=k-1;//k represents mid
            }
            else{
                low=k+1;
            }
        }
        return ans;
    }
    public boolean canShip(int[] weight,int k,int d){
        long cap=0;
        int days=1;
        for(int w:weight){
            if(cap+w > k){
                days++;
                cap=w;
            }
            else{
                cap+=w;
            }
        }
        return days<=d;
    }
}