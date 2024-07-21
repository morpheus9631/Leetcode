package com.example.leetcode._051_to_100._088_MergeSortedArray;

import java.util.Arrays;

import com.example.leetcode.utils.myStringUtils;

public class Main088
{

  public static void main(String[] args)
  {
    System.out.println("88. Merge Sorted Array");
    
    String format = "\r\nm = %d, nums1: %s"
                  + "\r\nn = %d, nums2: %s"
                  + "\r\nReturn: %s"
                  + " \r\n\r\n" + myStringUtils.dashLine(30)
                  ;
    
    Solution088 sol = new Solution088v3();
    
    for (int[][] testcase : _testCases)
    {
      int[] nums1 = testcase[0];
      int m = testcase[1][0];
      int[] nums2 = testcase[2];
      int n = testcase[3][0];
      
      String str1 = Arrays.toString(nums1);
      sol.merge(nums1, m, nums2, n);
      
      System.out.println(String.format(format, 
          m, str1, n, Arrays.toString(nums2), Arrays.toString(nums1)));
    }
  }

  private static int[][][] _testCases = 
  {
      { {1}, {1}, {}, {0} }       // Expected: [1]
    , { {0}, {0}, {1}, {1} }      // Expected: [1]
    , { {1,0}, {1}, {2}, {1} }    // Expected: [1,2]
    , { {1,2,3,0,0,0}, {3}, {2,5,6}, {3} }  // {1,2,2,3,5,6} 

  };
}
