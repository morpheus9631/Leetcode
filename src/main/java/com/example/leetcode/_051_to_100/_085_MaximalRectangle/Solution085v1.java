package com.example.leetcode._051_to_100._085_MaximalRectangle;

import java.util.Stack;

public class Solution085v1 implements Solution085
{
  public int maximalRectangle(char[][] matrix) 
  {
  	int maxArea = 0;

  	int row = matrix.length;
  	if (row == 0) return 0;
  	
  	int col = matrix[0].length;
  	if (col == 0) return 0;
   
  	int[][] heights = new int[row][col];
  	
  	for (int j=0; j<col; j++) {
  		heights[0][j] = (matrix[0][j] == '0') ? 0 : 1; 
  	}

  	for (int i=1; i<row; i++) {
  		for (int j=0; j<col; j++) {
  			heights[i][j] = ((matrix[i][j] == '1') ? heights[i-1][j]+1 : 0);
  		}
  	}

  	for (int i=0; i<row; i++)
  	{
  		int tmp_maxArea = this.largestRectangleInHistogram(heights[i]);
  		if (tmp_maxArea > maxArea) maxArea = tmp_maxArea; 
  	}
  	
  	return maxArea;
  }
	
	
  public int largestRectangleInHistogram(int[] heights)
  {
  	int maxArea = 0;
  	
  	int len = heights.length;

  	if (len == 0) return maxArea;
  	
  	Stack<Integer> stack = new Stack<>();

  	int curr_idx = 0;
  	while (curr_idx <= len)
  	{
  		int curr_h = (curr_idx == len) ? 0 : heights[curr_idx];
  		
  		if (stack.empty() || curr_h >= heights[stack.peek()]) 
  		{
  			stack.push(curr_idx++);
  		}
  		else
  		{
  			int prev_idx = stack.pop();
  			int width = stack.empty() ? curr_idx : curr_idx-1-stack.peek();
  			int area = width * heights[prev_idx];
  			if (area > maxArea) maxArea = area;
  		}
  	}
		return maxArea;
  }
 
}
