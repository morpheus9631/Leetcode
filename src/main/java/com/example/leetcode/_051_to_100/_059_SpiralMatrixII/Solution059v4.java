package com.example.leetcode._051_to_100._059_SpiralMatrixII;

public class Solution059v4 implements Solution059
{
  public int[][] generateMatrix(int n) 
  {
    int[][] result = new int[n][n];

    int layer;
    int k;
    for (int i = 0; i < n; i++) 
    {
      for (int j = 0; j < n; j++) 
      {
        layer = layer(i, j, n); // 當前坐標外有幾層
        
        // n * n - layer * layer外圍層使用的最後一個數字（也是最大的）
        // 坐標所在的當前層使用的第一個數字
        k = n * n - (n - 2 * layer) * (n - 2 * layer) + 1;
        result[i][j] = k;

        // (n - 2 * layer - 1)：四個(n - 2 * layer - 1)就是（x，y）坐標所在層的所有元素個數
        if (i == layer) { // 情況一、坐標離上邊界最近
          result[i][j] = k + j - layer;
        } else if (j == n - layer - 1) { // 情況二、坐標離右邊界最近
          result[i][j] = k + (n - 2 * layer - 1) + i - layer;
        } else if (i == n - layer - 1) { // 情況三、坐標離下邊界最近
          result[i][j] = k + 3 * (n - 2 * layer - 1) - (j - layer);
        } else { // 情況三、坐標離左邊界最近
          result[i][j] = k + 4 * (n - 2 * layer - 1) - (i - layer);
        }
      }
    }
    return result;
  }

  /**
   * 在一個n*n的矩陣中，計算（x,y）坐標外有多少層，坐標從0開始計算
   *
   * @param x 橫坐標
   * @param y 縱坐標
   * @param n 矩陣大小
   * @return 坐標外的層數
   */
  public int layer(int x, int y, int n) 
  {
    x = (x < n-1-x) ? x : (n-1-x); // 計算橫坐標離上下邊界的最近距離
    y = (y < n-1-y) ? y : (n-1-y); // 計算縱坐標離左右邊界的最近距離
    return x < y ? x : y;          // 較小的值為坐標的外圍層數
  }
}
