package com.example.leetcode._001_to_050._048_RotateImage;

public class Solution048v1 implements Solution048
{
  public void rotate(int[][] matrix) 
  {
    if (matrix == null)
      throw new IllegalArgumentException("illegal matrix");
    
    int rows = matrix.length;
    if (rows == 0) return;
    
    int cols = matrix[0].length;
    if (cols == 0) return;
    
    if (rows != cols) return;
    
    // 上下列交換
    int numSwaps = rows / 2;
    for (int i=0; i<numSwaps; i++)
    {
      for (int j=0; j<cols; j++)
      {
        int tmp = matrix[i][j];
        matrix[i][j] = matrix[rows-i-1][j];
        matrix[rows-i-1][j] = tmp;
      }
    }
    
    // 鏡像交換
    for (int i=1; i<rows; i++)
    {
      for (int j=0; j<i; j++)
      {
        int tmp = matrix[i][j];
        matrix[i][j] = matrix[j][i];
        matrix[j][i] = tmp;
      }
    }
  }
}
