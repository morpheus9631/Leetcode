package com.example.leetcode._051_to_100._066_PlusOne;

import java.util.Arrays;

public class Main066
{

  public static void main(String[] args)
  {
    System.out.println("62. Unique Paths");
    
    String format = "\r\ndigits = %s"
                  + "\r\nReturn: %s"
                  ;
  
    Solution066 sol = new Solution066v1();
    for (int[] digits : _testCases)
    {
      int[] res = sol.plusOne(digits);
      
      System.out.println(String.format(format, 
          Arrays.toString(digits), Arrays.toString(res)));
    }
  }

  private static int[][] _testCases = 
  {
    {0} 
  };
}
