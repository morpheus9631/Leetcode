package com.example.leetcode._001_to_050._026_RemoveDuplicatesFromSortedArray;

import java.util.Arrays;

public class Main026
{
  public static void main(String[] args)
  {
    System.out.println("26. Remove Duplicates from Sorted Array");
    
    String format = "\r\nnums = %s"
                  + "\r\nlength is %d"
                  ;
    
    Solution026 sol = new Solution026v3();
    
    for (int[] nums : _testCases)
    {
      int len = sol.removeDuplicates(nums);
      
      System.out.println(String.format(format, 
          Arrays.toString(nums), len));
    }
  }

  private static int[][] _testCases = 
  {
    {}, {1,1,2}, {1,2,2,3,3},
    {
      -50,-50,-50,-50,-49,-48,-47,-47,-45,-44,
      -44,-43,-42,-41,-41,-41,-39,-38,-37,-36,
      -35,-34,-33,-32,-31,-30,-30,-29,-29,-29,
      -26,-24,-22,-22,-21,-21,-20,-19,-18,-18,
      -18,-18,-17,-17,-17,-16,-15,-14,-13,-13,
      -12,-12,-12,-11,-10, -9, -9, -8, -7, -5,
       -5, -4, -3, -2, -2,  0,  0,  1,  4,  4,
        6,  6,  7,  8,  9,  9,  9, 11, 12, 13,
       14, 14, 17, 17, 18, 18, 18, 18, 19, 19,
       20, 24, 24, 24, 26, 28, 30, 30, 30, 33,
       34, 34, 35, 36, 36, 37, 37, 37, 38, 38,
       41, 43, 45, 45, 46, 47, 48, 49, 49, 49
    }
  };
}
