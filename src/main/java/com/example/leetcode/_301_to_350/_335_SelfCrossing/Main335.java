package com.example.leetcode._301_to_350._335_SelfCrossing;

import java.util.Arrays;


public class Main335
{
  public static void main(String[] args)
  {
    System.out.println("335. Self Crossing");
    
    String format = "\r\nGiven x = %s"
                  + "\r\nReturn: %b"
                  ;
    
    Solution335 sol = new Solution335v2();

    for (int[] x : _testCases)
    {
      boolean isSelfCross = sol.isSelfCrossing(x);
      System.out.println(
          String.format(format, Arrays.toString(x), isSelfCross));
    }
  }
  
  private static int[][] _testCases = 
  {
      { 2, 1, 1, 2 }                  // Expected: true
    , { 1, 2, 3, 4 }                  // Expected: false 
    , { 1, 1, 1, 1 }                  // Expected: true
    , { 1, 1, 2, 1, 1 }               // Expected: true
    , { 1, 2, 2, 3, 4 }               // Expected: false
    , { 3, 3, 4, 2, 2 }             // Expected: false
    , { 2, 1, 4, 4, 3, 3, 2, 1, 1 } 
    , { 3, 3, 3, 2, 1, 1 }            // Expected: false
    , { 1,1,2,2,3,3,4,4,10,4,4,3,3,2,2,1,1 }   // Expected: false
  };
}
