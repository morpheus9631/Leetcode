package com.example.leetcode._351_to_400._400_NthDigit;

import com.example.leetcode.utils.myStringUtils;

public class Main400
{
  public static void main(String[] args)
  {
    System.out.println("400. Nth Digit");
    
    String format = "\r\nInput: %d"
                  + "\r\nOutput: %d"
                  + "\r\n\r\n" + myStringUtils.dashLine(20)
                  ;
    
    Solution400 sol = new Solution400v1();
    
    for (int n : _testCases)
    {
      int res = sol.findNthDigit(n);
      System.out.println(String.format(format, n, res));
    }

  }

  private static int[] _testCases = 
  {
         2,   3,   9
     ,  10,  11,  12, 13
     , 190, 191, 192, 193, 194, 195
     , 1000000000                // Exptected: 1
  };
}
