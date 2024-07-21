package com.example.leetcode._051_to_100._053_MaximumSubarray;

import java.util.Arrays;

import com.example.leetcode.utils.myStringUtils;

public class Main053
{
  public static void main(String[] args)
  {
    System.out.println("53. Maximum Subarray");
    
    String format = "\r\nS = %s"
                  + "\r\nThe largest sum = %d"
                  + "\r\n\r\n" + myStringUtils.dashLine();
    
    Solution053 sol = new Solution053v3();

    for (int[] test_case : _testCases)
    {
      int maxSum = sol.maxSubArray(test_case);
      
      System.out.println(
          String.format(format, Arrays.toString(test_case), maxSum));
    }
  }
  
  private static int[][] _testCases =
  {
    { -2, 1, -3, 4, -1, 2, 1, -5, 4 },
    { 1 },
    { -2, 1 }
  };
}
