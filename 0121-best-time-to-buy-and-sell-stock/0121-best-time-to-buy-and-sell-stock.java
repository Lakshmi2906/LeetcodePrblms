class Solution {
    public int maxProfit(int[] prices) {
        int minprice=Integer.MAX_VALUE,profit=Integer.MIN_VALUE;
        for(int price:prices){
            if(price<minprice) minprice=price;
            int cprofit=price-minprice;
            if(cprofit>profit) profit=cprofit;
        }
        return profit;
    }
}