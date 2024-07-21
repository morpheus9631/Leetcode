package com.example.leetcode._251_to_300._279_PerfectSquares;


public class Main279
{
  public static void main(String[] args)
  {
    System.out.println("279. Perfect Squares");
    
    String format = "\r\nN = %d"
                  + "\r\nReturn: %d"
                  ;
                  
    Solution279v2 sol = new Solution279v2();
    for (int num : _testCases)
    {
      int res = sol.numSquares(num);
      System.out.println(String.format(format, num, res));
    }
  }

  private static int[] _testCases = 
  {
    12, 13, 172, 5, 7168, 1, 2, 43, 9732, 9975    
  };
}
