package com.example.leetcode._251_to_300._268_MissingNumber;

import java.util.Arrays;

public class Main268
{
  public static void main(String[] args)
  {
    System.out.println("268. Missing Number");
    
    String format = "\r\nNums = %s"
                  + "\r\nThe missing number is %d";
    
    Solution268 sol = new Solution268v3();
    for (int[] nums : _testCases)
    {
      String numStr = Arrays.toString(nums);
      int misNum = sol.missingNumber(nums);
      
      System.out.println(String.format(format, numStr, misNum));
    }
  }
  
  private static int[][] _testCases = 
  {
    {0,1,3}, {1}, {0}, {0,1}, {1,0}, {1,2}    
  };
}
