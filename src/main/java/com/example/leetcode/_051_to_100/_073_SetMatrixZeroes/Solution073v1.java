package com.example.leetcode._051_to_100._073_SetMatrixZeroes;

public class Solution073v1 implements Solution073
{
  public void setZeroes(int[][] matrix) 
  {
  	if (matrix == null) throw new IllegalArgumentException("illegal matrix");
  	
  	int rows = matrix.length;
  	if (rows == 0) return;
  	
  	int cols = matrix[0].length;
  	if (cols == 0) return;
  	
  	// 使用二個布林變數來記錄第 0列和第 0行是否有 0
  	boolean rowFlag = false;
  	boolean colFlag = false;
  	
  	// 檢查第 0 行是否有 0, 如果有, 行旗標設為 true
  	for (int i=0; i<rows; i++) 
  	{
  		if (matrix[i][0] == 0) 
  		{ 
  			colFlag = true;
  			break;
  		}
  	}
  	
  	// 檢查第 0 列是否有 0, 如果有, 列旗標設為 true
  	for (int j=0; j<cols; j++) 
  	{
  		if (matrix[0][j] == 0) 
  		{ 
  			rowFlag = true;
  			break;
  		}
  	}
  	
  	// 檢查剩下的矩陣中是否有 0，如果有，就將對應的第 0 列和第 0 行設為 0
  	for (int i=1; i<rows; i++)
  	{
  		for (int j=1; j<cols; j++)
  		{
  			if (matrix[i][j] == 0)
  			{
  				matrix[i][0] = 0;
  				matrix[0][j] = 0;
  			}
  		}
  	}
  	
    // 根據第 0 行的值將對應的列全設為 0
  	for (int i=1; i<rows; i++)
  	{
  		for (int j=1; j<cols; j++)
  		{
  			if ((matrix[i][0] == 0) || (matrix[0][j]) == 0)
  			{
  				matrix[i][j] = 0;
  			}
  		}
  	}
  	
  	// 根據行旗標來決定是否第 0 行要設為 0
  	if (colFlag) {
  		for (int i=0; i<rows; i++) matrix[i][0] = 0;
  	}

  	// 根據列旗標來決定是否第 0 列要設為 0
  	if (rowFlag) {
  		for (int j=0; j<cols; j++) matrix[0][j] = 0;
  	}
  }
}

