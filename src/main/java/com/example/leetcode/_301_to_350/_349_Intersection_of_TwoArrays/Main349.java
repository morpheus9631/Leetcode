package com.example.leetcode._301_to_350._349_Intersection_of_TwoArrays;

import java.util.Arrays;

public class Main349
{
  public static void main(String[] args)
  {
    System.out.println("349. Intersection of Two Arrays");
    
    String format = "\r\nnum1 = %s"
                  + "\r\nnum2 = %s"
                  + "\r\nReturn: %s"
                  ;
    
    Solution349 sol = new Solution349v3();
    
    for (int[][] testcase : _testCases)
    {
      int[] nums1 = testcase[0];
      int[] nums2 = testcase[1];
      
      int[] res = sol.intersection(nums1, nums2);
      
      System.out.println(String.format(format, 
          Arrays.toString(nums1), Arrays.toString(nums2), 
          Arrays.toString(res)));
    }

  }

  private static int[][][] _testCases = 
  {
      { {}, {} }
    , { {1,2,2,1}, {2,2} }  
  };
}
