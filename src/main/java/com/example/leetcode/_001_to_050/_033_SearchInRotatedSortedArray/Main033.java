package com.example.leetcode._001_to_050._033_SearchInRotatedSortedArray;

import java.util.Arrays;

import com.example.leetcode.utils.myStringUtils;

public class Main033
{
  public static void main(String[] args)
  {
    System.out.println("33. Search in Rotated Sorted Array");
    
    Solution033 sol = new Solution033v1();
    
    for (int[][] test_case : _testCases)
    {
      int[] nums = test_case[0];
      int target = test_case[1][0];
      int res = sol.search(nums, target);
      
      System.out.println(String.format(_format, 
          Arrays.toString(nums), target, res));
    }
  }
  
  private static int[][][] _testCases = 
  {
      { {4,5,6,7,0,1,2}, {3} }
    , { {4,5,6,7,0,1,2}, {0} }
    , { {0,1,2,4,5,6,7}, {0} }
    , { {3,1}, {2} }
    , { {}, {5} }
  };
  
  private static String _format =
        "\r\nNums: %s"
      + "\r\nTarget = %d"
      + "\r\n\r\nResult: %d"
      + "\r\n\r\n" + myStringUtils.dashLine();
}
