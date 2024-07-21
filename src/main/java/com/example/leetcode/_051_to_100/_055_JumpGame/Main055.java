package com.example.leetcode._051_to_100._055_JumpGame;

import java.util.Arrays;

public class Main055
{
  public static void main(String[] args)
  {
    System.out.println("55. Jum Game:");
    
    String format = "\r\nA: %s is %b";
 
    Solution055 sol = new Solution055v2();
    
    for (int[] test_case : _testCases)
    {
      boolean res = sol.canJump(test_case);
      
      System.out.println(String.format(format, 
          Arrays.toString(test_case), res));
    }
  }
  
  private static int[][] _testCases =
  {
    { 2,3,1,1,4 },
    { 3,2,1,0,4 },
    { 2,0 },            // true
    {2,5,0,0, }         // true
  };

}
