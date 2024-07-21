package com.example.leetcode._301_to_350._326_PowerOfThree;

public class Main326
{
  public static void main(String[] args)
  {
    System.out.println("326. Power of Three");
    
    String format = "\r\nn = %d"
                  + "\r\nIs it a power of three? %b";
    
    Solution326 sol = new Solution326v2();
    
    for (int n : _testCases)
    {
      boolean isPow3 = sol.isPowerOfThree(n);
      System.out.println(String .format(format, n, isPow3));
    }
  }

  private static int[] _testCases = 
  {
    27, 28  
  };
}
