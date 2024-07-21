package com.example.leetcode._301_to_350._304_RangeSumQuery2DImmutable;

public class NumMatrix 
{
	private int[][] _matrixSum = null;
	
  public NumMatrix(int[][] matrix) 
  {
  	if ((matrix == null) || (matrix.length == 0) || (matrix[0].length == 0))
  		return;
  	
  	int rows = matrix.length;
  	int cols = matrix[0].length;

  	_matrixSum = new int[rows+1][cols+1];
  	for (int i=1; i<rows+1; i++) {
  		for (int j=1; j<cols+1; j++) {
  			_matrixSum[i][j] = _matrixSum[i-1][j] + _matrixSum[i][j-1] 
  					             - _matrixSum[i-1][j-1] + matrix[i-1][j-1]; 
  		}
  	}
  }

  public int sumRegion(int row1, int col1, int row2, int col2) 
  {
  	return _matrixSum[row2+1][col2+1] - _matrixSum[row1][col2+1] 
  			 - _matrixSum[row2+1][col1]   + _matrixSum[row1][col1]; 
  }
}


//Your NumMatrix object will be instantiated and called as such:
//NumMatrix numMatrix = new NumMatrix(matrix);
//numMatrix.sumRegion(0, 1, 2, 3);
//numMatrix.sumRegion(1, 2, 3, 4);