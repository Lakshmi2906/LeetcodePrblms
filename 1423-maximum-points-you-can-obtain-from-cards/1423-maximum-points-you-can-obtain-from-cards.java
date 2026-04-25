class Solution {
    public int maxScore(int[] cardPoints, int k) {
        int lsum=0;
        int rsum=0,maxSum=0;
        for(int i=0;i<k;i++){
            lsum=lsum+cardPoints[i];
        }
        if(k==cardPoints.length){
            return lsum;
        }
        maxSum=lsum;
        int right=cardPoints.length-1;
        for(int i=k-1;i>=0;i--){
            lsum=lsum-cardPoints[i];
            rsum=rsum+cardPoints[right];
            right=right-1;
            maxSum=Math.max(maxSum,lsum+rsum);
        }
        return maxSum;
    }
}