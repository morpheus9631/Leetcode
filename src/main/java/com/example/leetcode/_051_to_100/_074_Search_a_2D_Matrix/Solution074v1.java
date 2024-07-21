package com.example.leetcode._051_to_100._074_Search_a_2D_Matrix;

public class Solution074v1 implements Solution074
{
  public boolean searchMatrix(int[][] matrix, int target) 
  {
    boolean isExist = false;
    
    if (matrix == null) throw new IllegalArgumentException("Illegal matrix");
    
    if (matrix.length == 0) return false;
    int rows = matrix.length;
    
    if (matrix[0].length == 0) return false;
    int cols = matrix[0].length;
    
    int left = 0, right = rows * cols - 1;
    while (left <= right)
    {
      int mid = (left + right) / 2;
      int i = (mid / cols);
      int j = (mid % cols);

      if (target > matrix[i][j])
      {
        left = mid + 1;
      }  
      else if (target < matrix[i][j])
      {
        right = mid - 1; 
      }
      else if (matrix[i][j] == target) 
      {
        isExist = true; break;
      }
    }
    return isExist;
  }
}
