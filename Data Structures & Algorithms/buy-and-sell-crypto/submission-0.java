class Solution {
    public int maxProfit(int[] prices) {
        int res=0;
      for(int i=0;i<prices.length;i++)
      {
        int buy=prices[i];
        int profit=0;
        for(int j=i+1;j<prices.length;j++)
        {
            if(buy<prices[j])
            {
                profit=Math.max(profit,prices[j]-buy);
            }
        }
        res=Math.max(res,profit);
      } 
      return res; 
    }
}
