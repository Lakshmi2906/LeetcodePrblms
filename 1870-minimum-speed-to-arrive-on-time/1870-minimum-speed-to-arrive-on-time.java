class Solution {
    public int minSpeedOnTime(int[] dist, double hour) {
        int low=1,high=10000000,ans=-1;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(canGo(dist,mid,hour)){
                ans=mid;
                high=mid-1;
            }
            else low=mid+1;
        }
        return ans;
    }
    public boolean canGo(int[] dist,int k,double hr){
        double time=0.0;
        for(int i=0;i<dist.length;i++){
            double hour=(double) dist[i]/k;
            if(i!=dist.length-1){
                time+=Math.ceil(hour);
            }
            else time+=hour;
        }
        return time<=hr;
    }    
}