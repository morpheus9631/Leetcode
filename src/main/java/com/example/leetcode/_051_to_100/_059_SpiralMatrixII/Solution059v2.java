package com.example.leetcode._051_to_100._059_SpiralMatrixII;

public class Solution059v2 implements Solution059
{
  public int[][] generateMatrix(int n) 
  {
    if (n < 0) return null;
    if (n == 0) return new int[0][0];
    
    int[][] matrix = new int[n][n];

    int i = 0, j = -1, k = 1;
    while (k <= n*n)
    {
      while (j+1 < n && matrix[i][j+1] == 0) {
        matrix[i][++j] = k++;
      }
      
      while (i+1 < n && matrix[i+1][j] == 0) { 
        matrix[++i][j] = k++;
      }

      while (j-1 >= 0 && matrix[i][j-1] == 0) { 
        matrix[i][--j] = k++;
      }

      while (i-1 >= 0 && matrix[i-1][j] == 0) { 
        matrix[--i][j] = k++;
      }
    }
    return matrix;
  }
}
