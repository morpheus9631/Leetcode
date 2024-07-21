package com.example.leetcode._201_to_250._209_MinimumSizeSubarraySum;

import java.util.Arrays;

import com.example.leetcode.utils.myStringUtils;

public class Main209
{
  public static void main(String[] args)
  {
    System.out.println("209 Minimum Size Subarray Sum");
    
    String format = "\r\nArray = %s and s = %d"
                  + "\r\nMinimum length is %d "
                  + "\r\n\r\n" + myStringUtils.dashLine()
                  ;
    
    Solution209 sol = new Solution209v1();
    
    for (int[][] testcase : _testCases)
    {
      int s = testcase[0][0];
      int[] nums = testcase[1];
      int len = sol.minSubArrayLen(s, nums);
      
      System.out.println(
          String.format(format, Arrays.toString(nums), s, len));
    }
  }
  
  private static int[][][] _testCases = 
  {
      { {7}, {2,3,1,2,4,3} }
    , { {11}, {1,2,3,4,5} }            // Expected: 3
  };
}
