package com.example.leetcode._151_to_200._152_MaximumProductSubarray;

import java.util.Arrays;

public class Main152
{
  public static void main(String[] args)
  {
    System.out.println("152. Maximum Product Subarray");
    
    String format = "\r\nS = %s"
                  + "\r\nThe largest product = %d";
    
    Solution152 sol = new Solution152v1();

    for (int[] nums : _testCases)
    {
      int max_product = sol.maxProduct(nums);
      
      System.out.println(String.format(format, 
          Arrays.toString(nums), max_product));
    }
  }
  
  private static int[][] _testCases = 
  {
    { 2, 3, -1, 4 }, { 2, -1, 1, 1 }      
  };
}
