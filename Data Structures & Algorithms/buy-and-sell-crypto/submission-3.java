class Solution {
    public int maxProfit(int[] prices) {
        int res = 0;
        int cur = 0;
        int  next = cur+1;
        while(next < prices.length){
            if(prices[cur] < prices[next]){
                int profit = prices[next] - prices[cur];
                res = Math.max(profit, res);
            }
            else{
                cur = next;   
            }
            next++ ;
        }
        return res;
        
    }
}
