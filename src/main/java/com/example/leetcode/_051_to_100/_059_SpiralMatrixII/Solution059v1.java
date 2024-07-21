package com.example.leetcode._051_to_100._059_SpiralMatrixII;

import java.util.Arrays;

public class Solution059v1 implements Solution059
{
  public int[][] generateMatrix(int n) 
  {
    if (n < 0) return null;
    if (n == 0) return new int[0][0];
    
    int[][] matrix = new int[n][n];
    for (int i=0; i<n; i++) Arrays.fill(matrix[i], 0);
    
    int i = 0, j = -1, k = 1;
    int dir = 1;  // 1: Right, 2: Down, 3: Left, 4: Up

    while (k <= n*n)
    {
      switch(dir)
      {
        case 1:
          while (j+1 < n && matrix[i][j+1] == 0) {
            matrix[i][++j] = k++;
          }
          dir = 2;
          break;
        case 2:
          while (i+1 < n && matrix[i+1][j] == 0) { 
            matrix[++i][j] = k++;
          }
          dir = 3;
          break;
        case 3:
          while (j-1 >= 0 && matrix[i][j-1] == 0) { 
            matrix[i][--j] = k++;
          }
          dir = 4;
          break;
        case 4:
          while (i-1 >= 0 && matrix[i-1][j] == 0) { 
            matrix[--i][j] = k++;
          }
          dir = 1;
          break;
      }
    }
    return matrix;
  }
}
