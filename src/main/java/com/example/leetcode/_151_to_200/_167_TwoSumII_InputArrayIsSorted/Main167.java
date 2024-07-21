package com.example.leetcode._151_to_200._167_TwoSumII_InputArrayIsSorted;

import java.util.Arrays;

public class Main167
{
  public static void main(String[] args)
  {
    System.out.println("167. Two Sum II - Input array is sorted");
    
    String format = "\r\nnumbers = %s"
                  + "\r\nTarget is %d"
                  + "\r\nindex1 = %d, index2 = %d";
    
    Solution167 sol = new Solution167v1();
    
    for (int[][] testcase : _testCases)
    {
      int target = testcase[0][0];
      int[] numbers = testcase[1];
      int[] idxs = sol.twoSum(numbers, target);
      
      System.out.println(String.format(format, 
          Arrays.toString(numbers), target, idxs[0], idxs[1]));
    }
        

  }
  
  private static int[][][] _testCases = 
  {
      { {9}, {2,7,11,15} }
    , { {6}, {2,3,4} }  
  };
}
