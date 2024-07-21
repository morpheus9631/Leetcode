package com.example.leetcode._351_to_400._371_SumOfTwoIntegers;

public class Main371
{
  public static void main(String[] args)
  {
    System.out.println("371. Sum of Two Integers");
    
    String format = "\r\na = %d, b = %d"
                  + "\r\nReturn: %d"               
                  ;

    Solution371 sol = new Solution371v2();
    for (int[] testcase : _testCases)
    {
      int a = testcase[0];
      int b = testcase[1];
      int c = sol.getSum(a, b);
      
      System.out.println(String.format(format, a, b, c));
    }
  }

  private static int[][] _testCases = 
  {
      {1, 2}
  };
}
