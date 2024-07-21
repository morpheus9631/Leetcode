package com.example.leetcode._101_to_150._121_BestTimetoBuyAndSellStock;

import java.util.Arrays;

public class Main121
{
  public static void main(String[] args)
  {
    System.out.println("121. Best Time to Buy and Sell Stock");
    
    String format = "\r\nInput: %s"
                  + "\r\nOutput: %d"
                  ;
    
    Solution121 sol = new Solution121v1();
    
    for (int[] prices : _testCases)
    {
      int res = sol.maxProfit(prices);
      System.out.println(
          String.format(format, Arrays.toString(prices), res));
    }
  }
  
  private static int[][] _testCases = 
  {
      { 7, 1, 5, 3, 6, 4 }          // Expected: 5
    , { 7, 6, 4, 3, 1 }             // Expected: 0
    , { }                           // Expected: 0
  };
}
