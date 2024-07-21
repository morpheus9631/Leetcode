package com.example.leetcode._251_to_300._264_UglyNumberII;

public class Main264
{
  public static void main(String[] args)
  {
    System.out.println("264. Ugly Number II\r\n");

    String format = "\r\nThe %d-th ugly number is %s";
    
    Solution264 sol = new Solution264v2();
    
    for (int n : _testCases)
    {
      int num = sol.nthUglyNumber(n);
      System.out.println(String.format(format, n, num));
    }
  }

  private static int[] _testCases = 
  {
    10, 420, 1    
  };
}
