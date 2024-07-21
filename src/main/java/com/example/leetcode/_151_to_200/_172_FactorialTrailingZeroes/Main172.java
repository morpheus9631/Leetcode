package com.example.leetcode._151_to_200._172_FactorialTrailingZeroes;

public class Main172
{
  public static void main(String[] args)
  {
    System.out.println("172. Factorial Trailing Zeroes");
    
    String format = "\r\nn = %d"
                  + "\r\nThe trailing zeroes is %d";
    
    Solution172 sol = new Solution172v1();
    
    for (int n : _testCases)
    {
      int len = sol.trailingZeroes(n);
      System.out.println(String.format(format, n, len));
    }
  }
  
  private static int[] _testCases = 
  {
    0, 5, 10, 15, 20
  };
}
