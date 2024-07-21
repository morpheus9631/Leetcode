package com.example.leetcode._251_to_300._300_LongestIncreasingSubsequence;

import java.util.Arrays;

public class Main300
{
  public static void main(String[] args)
  {
    System.out.println("300. Longest Increasing Subsequence");
    
    String format = "\r\nS = %s"
                  + "\r\nLIS is %d";
                  ;
    
    Solution300v2 sol = new Solution300v2();
    
    for (int[] nums : _testCases)
    {
      int LIS = sol.lengthOfLIS(nums);

      System.out.println(String.format(format, Arrays.toString(nums), LIS));
    }
  }
  
  private static int[][] _testCases = 
  {
    { 10, 9, 2, 5, 3, 7, 101, 18 }    
  };
}
