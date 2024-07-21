package com.example.leetcode._201_to_250._219_ContainsDuplicateII;

import java.util.Arrays;

public class Main219
{
  public static void main(String[] args)
  {
    System.out.println("219. Contains Duplicate II");
    
    String format = "\r\nk = %d"
                  + "\r\nArray = %s"
                  + "\r\nContains Duplicate? %b"
                  ;

    Solution219 sol = new Solution219v1();
    
    for (int[][] testcase : _testCases)
    {
      int k = testcase[0][0];
      int[] nums = testcase[1];

      boolean res = sol.containsNearbyDuplicate(nums, k);
      System.out.println(
          String.format(format, k, Arrays.toString(nums), res));
    }
  }
  
  private static int[][][] _testCases = 
  {
      { {0}, {} }
    , { {2}, {99,99} }
    , { {1}, {-1,-1} }
    , { {1}, {1,0,1,1} }
  };
}
