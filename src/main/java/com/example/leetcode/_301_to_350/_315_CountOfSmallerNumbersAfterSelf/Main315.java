package com.example.leetcode._301_to_350._315_CountOfSmallerNumbersAfterSelf;

import java.util.Arrays;
import java.util.List;

public class Main315
{
  public static void main(String[] args)
  {
    System.out.println("315. Count of Smaller Numbers After Self");
    
    String format = "\r\nnums = %s"
                  + "\r\nReturn: %s"
                  ;

    Solution315 sol = new Solution315v1();

    for (int[] nums : _testCases)
    {
      List<Integer> list = sol.countSmaller(nums);
      
      System.out.println(
          String.format(format, Arrays.toString(nums), list.toString()));
    }
  }
  
  private static int[][] _testCases = 
  {
      {5,2,6,1}    
  };
}
