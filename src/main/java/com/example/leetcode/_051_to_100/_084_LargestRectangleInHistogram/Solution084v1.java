package com.example.leetcode._051_to_100._084_LargestRectangleInHistogram;

import java.util.Stack;

public class Solution084v1 implements Solution084
{
  public int largestRectangleArea(int[] heights) 
  {
  	int maxArea = 0;
  	
  	int len = heights.length;

  	if (len == 0) return maxArea;
  	
  	Stack<Integer> stack = new Stack<>();

  	int curr_idx = 0;
  	while (curr_idx <= len)
  	{
  		int curr_h = (curr_idx == len) ? 0 : heights[curr_idx];
  		int prev_h = stack.empty() ? 0: heights[stack.peek()];
  		
  		if (stack.empty() || curr_h >= prev_h) 
  		{
  			stack.push(curr_idx++);
  		}
  		else
  		{
  			int prev_idx = stack.pop();
  			int width = stack.empty() ? curr_idx : curr_idx-1-stack.peek();
  			int area = width * heights[prev_idx];
  			maxArea = Math.max(maxArea,  area);
  		}
  	}
		return maxArea;
  }
}
