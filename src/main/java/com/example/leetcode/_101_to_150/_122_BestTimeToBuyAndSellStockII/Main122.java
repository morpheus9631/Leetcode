package com.example.leetcode._101_to_150._122_BestTimeToBuyAndSellStockII;

import java.util.Arrays;

public class Main122
{
  public static void main(String[] args)
  {
    System.out.println("122. Best Time to Buy and Sell Stock II");
    
    String format = "\r\nPrices: %s"
                  + "\r\nMax profit is %d"
                  ;
    
    Solution122 sol = new Solution122v1();
    
    for (int[] prices : _testCases)
    {
      int res = sol.maxProfit(prices);
      System.out.println(
          String.format(format, Arrays.toString(prices), res));
    }
  }
  
  private static int[][] _testCases = 
  {
      {}                            // Expected: 0
    , { 7, 1, 5, 3, 6, 4 }
    , { 7, 6, 4, 3, 1 }
  };
}
