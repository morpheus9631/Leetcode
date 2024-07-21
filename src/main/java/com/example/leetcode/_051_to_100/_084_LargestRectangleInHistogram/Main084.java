package com.example.leetcode._051_to_100._084_LargestRectangleInHistogram;

import java.util.Arrays;

public class Main084 
{
	public static void main(String[] args) 
	{
	  System.out.println("84. Largest Rectangle in Histogram");
	  
	  String format = "\r\nheights = %s"
	                + "\r\nThe largest rectangle is %d";
	      
		Solution084 sol = new Solution084v1();
		
		for (int[] heights : _testCases)
		{
	    int maxArea = sol.largestRectangleArea(heights);
	    
	    System.out.println(
	        String.format(format, Arrays.toString(heights), maxArea));
		}
	}
	
	private static int[][] _testCases = 
	{
	  { 2, 1, 5, 6, 2, 3 }
	};
}
