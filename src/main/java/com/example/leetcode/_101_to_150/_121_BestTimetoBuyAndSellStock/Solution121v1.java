package com.example.leetcode._101_to_150._121_BestTimetoBuyAndSellStock;

public class Solution121v1 implements Solution121
{
  public int maxProfit(int[] prices) 
  {
    if (prices.length == 0) return 0;
    
    int min = prices[0];
    int profit = 0;
    
    for (int i=1; i<prices.length; i++)
    {
      if (min > prices[i]) min = prices[i];
      
      if (prices[i] - min > profit)
        profit = prices[i] - min;
    }
    return profit;
  }
}
