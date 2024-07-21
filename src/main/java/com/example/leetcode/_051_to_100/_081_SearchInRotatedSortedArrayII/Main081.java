package com.example.leetcode._051_to_100._081_SearchInRotatedSortedArrayII;

import java.util.Arrays;


public class Main081
{
  public static void main(String[] args)
  {
    System.out.println("81. Search in Rotated Sorted Array II\r\n");

    String format = "\r\nS = %s"
                  + "\r\nTarget is %d: %b";

    Solution081 sol = new Solution081v1();

    for (int[][] testcase : _testCases)
    {
      int[] nums = testcase[0];
      int target = testcase[1][0];
      boolean isFound = sol.search(nums, target);
      
      System.out.println(
          String.format(format, Arrays.toString(nums), target, isFound));
    }
  }
  
  private static int[][][] _testCases =
  {
    { {1}, {0} },
    { {1,2,2,2,3,4,5,6,6,6,7}, {1} },
    { {1,3,1,1,1}, {3} }
  };
}
