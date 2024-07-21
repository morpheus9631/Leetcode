package com.example.leetcode._101_to_150._122_BestTimeToBuyAndSellStockII;

/*
 * Your runtime beats 11.98% of java submissions.
 */

public class Solution122v1 implements Solution122
{
  public int maxProfit(int[] prices)
  {
    if (prices == null || prices.length < 2) return 0;
    
    int maxPro = 0;
    for (int i=0; i<prices.length-1; i++)
    {
      if (prices[i+1] > prices[i])
        maxPro += prices[i+1] - prices[i];
    }
     return maxPro;
  }
}
