package com.example.leetcode._351_to_400._363_MaxSumOfRectangleNoLargerThanK;

/*
 * 2016.09.27: 此答案是錯的...
 */

public class Solution363v1 implements Solution363
{
  int[][] matrixSum = null;
  
  public int maxSumSubmatrix(int[][] matrix, int k) 
  {
    int maxSum = Integer.MIN_VALUE;
    
    createSumMatrix(matrix);
    
    int rows = matrix.length;
    int cols = matrix[0].length;
    for (int i1=0; i1<rows; i1++) 
    {
      for (int j1=0; j1<cols; j1++) 
      {
        for (int i2=0; i2<=i1; i2++) 
        {
          for (int j2=0; j2<=j1; j2++) 
          {
            int sum = sumRectangle(i1, j2, i2, j2);
            System.out.println(i1+", "+j2+", "+i2+", "+j2+", "+sum);

            if (sum <= k) maxSum = Math.max(sum, k);
          }
        }
      }
    }
    
    return maxSum;   
  }
  
  public void createSumMatrix(int[][] matrix)
  {
    int rows = matrix.length;
    int cols = matrix[0].length;
    
    matrixSum = new int[rows+1][cols+1];
    for (int i=1; i<rows+1; i++) {
      for (int j=1; j<cols+1; j++) {
        matrixSum[i][j] = matrixSum[i-1][j] + matrixSum[i][j-1] 
                        - matrixSum[i-1][j-1] + matrix[i-1][j-1]; 
      }
    }
  }
  
  public int sumRectangle(int r1, int c1, int r2, int c2)
  {
    return matrixSum[r2][c2] - matrixSum[r2+1][c1]
         - matrixSum[r1][c2+1] + matrixSum[r1][c1];
  }
  
  
}
