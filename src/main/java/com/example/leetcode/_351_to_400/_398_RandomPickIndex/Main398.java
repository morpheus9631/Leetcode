package com.example.leetcode._351_to_400._398_RandomPickIndex;

import java.util.Arrays;

public class Main398
{
  public static void main(String[] args)
  {
    System.out.println("398. Random Pick Index");
    
    String format = "\r\nsolution.pick(%d) at %d";
    
    Solution398 sol = new Solution398v1(nums);
    System.out.println("\r\nnums = "+Arrays.toString(nums));
    
    for (int target : _testCases)
    {
      int pick = sol.pick(target);
      System.out.println(String.format(format, target, pick));
    }
  }

  private static int[] nums = {1,2,3,3,3};  
  
  private static int[] _testCases = 
  {
    3, 1      
  };
}
