package com.example.leetcode._351_to_400._367_ValidPerfectSquare;

public class Main367
{
  public static void main(String[] args)
  {
    System.out.println("367. Valid Perfect Square");

    String  format = "\r\nnum = %d"
                   + "\r\nReturns: %b"
                   ;
    
    Solution367 sol = new Solution367v4();
    for (int num : _testCases)
    {
      boolean res = sol.isPerfectSquare(num);
      System.out.println(String.format(format, num, res));
    }
  }
  
  private static int[] _testCases = 
  {
    16, 14, 1, Integer.MAX_VALUE
  };
}
