package com.example.leetcode._151_to_200._198_HouseRobber;

import java.util.Arrays;

public class Main198
{
  public static void main(String[] args)
  {
    System.out.println("198. House Robber");
    
    String format = "\r\nS = %s"
                  + "\r\nReturn is %d";
    
    Solution198 sol = new Solution198v1();
    
    for (int[] nums : _testCases)
    {
      int res = sol.rob(nums);
      System.out.println(String.format(format, 
          Arrays.toString(nums), res));
    }
  }

  private static int[][] _testCases = 
  {
    {}
  };
}
