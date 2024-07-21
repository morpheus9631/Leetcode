package com.example.leetcode._051_to_100._080_RemoveDuplicatesFromSortedArrayII;

import java.util.Arrays;

public class Main080
{
  public static void main(String[] args)
  {
    System.out.println("80. Remove Duplicates from Sorted Array II");
    
    String format = "\r\nNums = %s"
                  + "\r\nThe length is %d";
    
    Solution080 sol = new Solution080v2();
    
    for (int[] nums : _testCases)
    {
      int len = sol.removeDuplicates(nums);
      System.out.println(
          String.format(format, Arrays.toString(nums), len));
    }
  }
  
  private static int[][] _testCases =
  {
    {1,1,1,2,2,3},      // Expected: [1,1,2,2,3]
    {1,1,1,2},          // Expected: [1,1,2]
    {},
    {1,2,2,2},          // Expected: [1,2,2]
    {1,1,1,2}           // Expected: [1,1,2]
  };
}
