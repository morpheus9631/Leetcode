package com.example.leetcode._051_to_100._062_UniquePaths;

public class Solution062v2 implements Solution062
{
  public int uniquePaths(int m, int n) 
  {
    int[][] result = new int[m][n];

    // 第一列的解
    for (int i=0; i<m; i++) result[i][0] = 1;

    // 第一行的解    
    for (int j=1; j<n; j++) result[0][j] = 1;

    // 其它位置的解
    for (int i=1; i<m; i++) {
      for (int j=1; j<n; j++) {
        result[i][j] = result[i-1][j] + result[i][j-1];
      }
    }

    // 所求的解
    return result[m-1][n-1];
  }
}  
