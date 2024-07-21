package com.example.leetcode._201_to_250._240_SearchA2DMatrixII;

import com.example.leetcode.utils.myArrayUtils;

public class Main240
{

  public static void main(String[] args)
  {
    System.out.println("240. Search a 2D Matrix II");
    
    String format = "\r\nTraget is %d ? %b";
                  
    Solution240 sol = new Solution240v1();
    
    System.out.println("\r\nMatrix:\r\n"+myArrayUtils.toString(matrix));
    
    for (int target : _testCases)
    {
      boolean isExist = sol.searchMatrix(matrix, target);
      
      System.out.println(String.format(format, target, isExist));
    }
  }  

  private static int[][] matrix = 
  {
    { 1,   4,  7, 11, 15 },
    { 2,   5,  8, 12, 19 },
    { 3,   6,  9, 16, 22 },
    { 10, 13, 14, 17, 24 },
    { 18, 21, 23, 26, 30 }
  };
  
  private static int[] _testCases = 
  {
    5, 20
  };
}
