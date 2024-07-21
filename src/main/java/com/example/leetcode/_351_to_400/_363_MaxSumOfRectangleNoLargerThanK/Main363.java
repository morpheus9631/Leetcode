package com.example.leetcode._351_to_400._363_MaxSumOfRectangleNoLargerThanK;

import com.example.leetcode.utils.myArrayUtils;
import com.example.leetcode.utils.myStringUtils;

public class Main363
{
  public static void main(String[] args)
  {
    System.out.println("363. Max Sum of Rectangle No Larger Than K");
    
    String format = "\r\nk = %d"
                  + "\r\nMartix:"
                  + "\r\n%s"
                  + "\r\n\r\nReturn: %d"
                  + "\r\n\r\n" + myStringUtils.dashLine();
                  ;
    
    Solution363 sol = new Solution363v2();
    
    for (int[][][] testcase : _testCases)
    {
      int k = testcase[0][0][0];
      int[][] matrix = testcase[1];
      int maxSum = sol.maxSumSubmatrix(matrix, k);
      System.out.println(
          String.format(format, k, myArrayUtils.toString(matrix), maxSum));
    }
  }

  private static int[][][][] _testCases = 
  {
      { { {2} }, { {1,0,1}, {0,-2,3} } }
    , { { {0} }, { {2,2,-1} } }  
  };
}
