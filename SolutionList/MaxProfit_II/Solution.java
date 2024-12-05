package SolutionList.MaxProfit_II;

class Solution {
    public int maxProfit(int[] prices) {
        int len = prices.length;
        int maxPft=0;
        for(int i=0;i<len-1;++i){
            if(prices[i]<prices[i+1]){
                maxPft+=prices[i+1]-prices[i];
            }
        }
        return maxPft;
    }
}
