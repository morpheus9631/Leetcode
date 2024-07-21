package com.example.leetcode._301_to_350._342_PowerOfFour;

public class Main342
{

  public static void main(String[] args)
  {
    System.out.println("342. Power of Four");
    
    String format = "\r\nn= %d %b";

    Solution342 sol = new Solution342v4();
    
    for (int num : _testCases)
    {
      boolean isPower4 = sol.isPowerOfFour(num);
      System.out.println(String.format(format, num, isPower4));
    }
  }

  private static int[] _testCases = 
  {
    16, 5, 32, Integer.MIN_VALUE
  };
}
