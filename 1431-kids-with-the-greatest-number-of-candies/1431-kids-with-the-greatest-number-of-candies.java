class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int sum=0,maxC=Integer.MIN_VALUE;
        List<Boolean> ans=new ArrayList<>();
        for(int c:candies){
            maxC=Math.max(c,maxC);
        }
        for(int i=0;i<candies.length;i++){
            sum=candies[i]+extraCandies;
            if(sum>=maxC){
                ans.add(true);
            }
            else ans.add(false);
        }
        return ans;
    }
}