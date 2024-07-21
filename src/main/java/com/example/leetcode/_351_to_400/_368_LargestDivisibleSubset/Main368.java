package com.example.leetcode._351_to_400._368_LargestDivisibleSubset;

import java.util.Arrays;
import java.util.List;


public class Main368
{
  public static void main(String[] args)
  {
    System.out.println("368. Largest Divisible Subset");
    
    String format = "\r\nnums = %s"
                  + "\r\nReturn: %s"
                  ;
    
     Solution368 sol = new Solution368v1();
     
     for (int[] nums : _testCases)
     {
       List<Integer> list = sol.largestDivisibleSubset(nums);
       System.out.println(
           String.format(format, Arrays.toString(nums), list.toString()));
     }
  }

  private static int[][] _testCases = 
  {
      {1,2,3}
    , {1,2,4,8}
  };
}
