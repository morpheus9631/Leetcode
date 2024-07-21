package com.example.leetcode._101_to_150._136_SingleNumber;

import java.util.Arrays;

public class Main136
{
  public static void main(String[] args)
  {
    System.out.println("136. Single Number");
    
    String format = "\r\nNums = %s"
                  + "\r\nReturn: %d";
    
    Solution136 sol = new Solution136v1();
    
    for (int[] nums :_testCases)
    {
      int res = sol.singleNumber(nums);
      
      System.out.println(
          String.format(format, Arrays.toString(nums), res));
    }
  }
  
  private static int[][] _testCases = 
  {
      {1}
    , {2,1,4,5,2,4,1}  
  };
}
