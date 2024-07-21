package com.example.leetcode._101_to_150._120_Triangle;

import java.util.List;

public class Solution120v2 implements Solution120
{
  public int minimumTotal(List<List<Integer>> triangle) 
  {
    if (triangle == null) 
      throw new IllegalArgumentException("Illegal triangle");
   
    int rows = triangle.size();
    if (rows == 0) return 0;

    int num00 = triangle.get(0).get(0);
    if (rows == 1) return num00;
    
    // 創建最小和的陣列
    int[][] minSum = new int[rows][];
    for (int i=0; i<rows; i++) {
        minSum[i] = new int[i+1];
    }
    
    // 設置第一列的元素
    minSum[0][0] = triangle.get(0).get(0);

    // 計算其他列的元素值
    for (int i=1; i<rows; i++) 
    {
      List<Integer> line = triangle.get(i);
      int cols = minSum[i].length;
      for (int j=0; j<cols; j++) 
      {
        if (j == 0) {
          minSum[i][0] = line.get(0) + minSum[i-1][0];
        } else if (j == i) {
          minSum[i][j] = line.get(j) + minSum[i-1][j-1];
        } else if (j < i) {
          minSum[i][j] = line.get(j) + Math.min(minSum[i-1][j], minSum[i-1][j-1]);
        }
      }
    }

    // 最後一列的最小元素就是解
    int min = minSum[rows-1][0];
    for (int j=1; j<minSum[rows-1].length; j++) {
        if (min > minSum[rows-1][j]) {
            min = minSum[rows-1][j];
        }
    }
    return min;
  }
}
