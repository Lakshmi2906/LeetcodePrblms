class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int low=1,high=0;
        for(int p:piles){
            high=Math.max(high,p);
        }
        int ans=high;
        while(low<=high){
            int k=low+(high-low)/2;
            if(canReach(piles,k,h)){
                ans=k;
                high=k-1; // k represents mid only
            }
            else{
                low=k+1;
            }
        }
        return ans;
    }
    public boolean canReach(int[] pile,int k,int h){
        long hr=0;
        for(int p:pile){
            hr+= (p+k-1)/k;
        }
        return hr<=h;
    }
}