package com.example.leetcode._001_to_050._029_DivideTwoIntegers;

import com.example.leetcode.utils.myStringUtils;

public class Main029
{
  public static void main(String[] args)
  {
    System.out.println("29. Divide Two Integers");
    
    String format = "\r\nDividend = %d"
                  + "\r\nDivisor = %d"
                  + "\r\n\r\nAns: %d"
                  + "\r\n\r\n" + myStringUtils.dashLine();
        
    Solution029 sol = new Solution029v1();
    
    int[][] testcases = getTestCases();
    for (int[] test_case : testcases)
    {
      int dividend = test_case[0];
      int divisor =  test_case[1];
      int ans = sol.divide(dividend, divisor);
      
      System.out.println(String.format(format, dividend, divisor, ans));
    }
  }
  
  private static int[][] getTestCases()
  {
    int[][] testcases = 
    {
        {17, 3}
      , {-1, 1}
      , {-2147483648, -1}       // Expected: -2147483648
      , {-2147483648, 1} 
    };
    return testcases;
  }
}
