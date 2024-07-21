package com.example.leetcode._401_to_450._441_ArrangingCoins;

public class Main441
{
  public static void main(String[] args)
  {
    System.out.println("441. Arranging Coins");
    
    String format = "\r\nn = %d"
                  + "\r\nReturn %d "
                  ;
    
    Solution441 sol = new Solution441v2();
    
    for (int n : _testCases)
    {
      int rows = sol.arrangeCoins(n);
      System.out.println(String.format(format, n, rows));
    }
    

  }

  private static int[] _testCases = 
  {
      0
    , 1
    , 5
    , 6
    , 8
    , 1804289383        // Expected: 60070
  };
}
