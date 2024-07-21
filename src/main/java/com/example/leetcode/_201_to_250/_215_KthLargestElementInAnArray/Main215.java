package com.example.leetcode._201_to_250._215_KthLargestElementInAnArray;

import java.util.Arrays;

public class Main215
{
  public static void main(String[] args)
  {
    System.out.println("215. Kth Largest Element in an Array");
    
    String format = "\r\nk = %d"
                  + "\r\nArray = %s"
                  + "\r\nReturn: %d"
                  ;
    
    Solution215 sol = new Solution215v1();
    
    for(int[][] testcase : _testCases)
    {
      int k = testcase[0][0];
      int[] nums = testcase[1];
      
      int res = sol.findKthLargest(nums, k);
      System.out.println(
          String.format(format, k, Arrays.toString(nums), res));
    }
    
  }
  
  private static int[][][] _testCases = 
  {
      { {2}, {3,2,1,5,6,4} }
  };
}
