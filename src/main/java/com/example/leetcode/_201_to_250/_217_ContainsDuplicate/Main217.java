package com.example.leetcode._201_to_250._217_ContainsDuplicate;

import java.util.Arrays;

public class Main217
{
  public static void main(String[] args)
  {
    System.out.println("217. Contains Duplicate");
    
    String format = "\r\nS = %s"
                  + "\r\nIs it contains any duplicates? %b";
    
    Solution217 sol = new Solution217v1();
    
    for (int[] nums : _testCases)
    {
      boolean isDup = sol.containsDuplicate(nums);
      System.out.println(
          String.format(format, Arrays.toString(nums), isDup));
    }
  }
  
  private static int[][] _testCases = 
  {
    {}, {1}, {1,2,3}, {1,2,2}  
  };
}
