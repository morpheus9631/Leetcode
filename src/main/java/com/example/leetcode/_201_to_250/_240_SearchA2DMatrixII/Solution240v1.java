package com.example.leetcode._201_to_250._240_SearchA2DMatrixII;

public class Solution240v1 implements Solution240
{
  public boolean searchMatrix(int[][] matrix, int target) 
  {
    if (matrix ==null) throw new IllegalArgumentException("Illegal matirx");

    if (matrix.length == 0 || matrix[0].length == 0) return false;

    int i = 0, j = matrix[0].length - 1;
    while (i < matrix.length && j >= 0)
    {
      int val = matrix[i][j];
      
      if (val == target) 
        return true;
      else if (val > target)
        j--;
      else if (val < target)
        i++;
    }
    
    return false;
  }
}
