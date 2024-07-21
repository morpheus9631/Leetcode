package com.example.leetcode._251_to_300._283_MoveZeroes;

import java.util.Arrays;

public class Main283
{
  public static void main(String[] args)
  {
    System.out.println("283. Move Zeroes");
    
    String format = "\r\nNums = %s"
                  + "\r\nReturn: %s"
                  ;
    
    Solution283 sol = new Solution283v4();
    
    for (int[] nums : _testCases)
    {
      String str1 = Arrays.toString(nums);
      sol.moveZeroes(nums);
      String str2 = Arrays.toString(nums);
      
      System.out.println(String.format(format, str1, str2));
    }
  }
  
  private static int[][] _testCases = 
  {
      {0,1,0,3,12}    
    , {0,0,1}  
  };
}
