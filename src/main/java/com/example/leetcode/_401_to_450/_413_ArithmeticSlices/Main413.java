package com.example.leetcode._401_to_450._413_ArithmeticSlices;

import java.util.Arrays;

public class Main413
{
  public static void main(String[] args)
  {
    System.out.println("413. Arithmetic Slices");

    String format = "\r\nA = %s"
                  + "\r\nReturn: %d"
                  ;
    
    Solution413 sol = new Solution413v1();
    
    for (int[] A : _testCases)
    {
      int res = sol.numberOfArithmeticSlices(A);
      
      System.out.println(String.format(format, Arrays.toString(A), res));
    }
  }

  private static int[][] _testCases = 
  {
      {1,2,3}
    , {1,2,3,4}
    , {1,2,3,4,5}
    , {1,2,3,8,9,10}
  };
}
