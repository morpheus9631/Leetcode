package com.example.leetcode._301_to_350._350_IntersectionOfTwoArraysII;

import java.util.Arrays;

public class Main350
{
  public static void main(String[] args)
  {
    System.out.println("350. Intersection of Two Arrays II");
    
    String format = "\r\nnum1 = %s"
                  + "\r\nnum2 = %s"
                  + "\r\nReturn: %s"
                  ;
    
    Solution350 sol = new Solution350v1();
    
    for (int[][] testcase : _testCases)
    {
      int[] nums1 = testcase[0];
      int[] nums2 = testcase[1];
      
      int[] res = sol.intersect(nums1, nums2);
      
      System.out.println(String.format(format, 
          Arrays.toString(nums1), Arrays.toString(nums2), 
          Arrays.toString(res)));
    }

  }

  private static int[][][] _testCases = 
  {
      { {}, {} }
    , { {1,2,2,1}, {2,2} }
    , { {1}, {1,1} }                // Excepted: [1]
    , { {1,2}, {1,1} }              // Excepted: [1]
  };
}
