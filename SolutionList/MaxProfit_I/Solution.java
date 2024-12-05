package SolutionList.MaxProfit_I;

class Solution {
    public int maxProfit(int[] prices) {
        int minPrice=Integer.MAX_VALUE;
        int maxPft=0;

        for(int curPrice:prices){

            if(curPrice<minPrice){
                minPrice = curPrice;
            }

            int curPft = curPrice - minPrice;

            if(curPft>maxPft){
                maxPft = curPft;
            }
        }

        return maxPft;
    }
}
