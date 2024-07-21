package com.example.leetcode._301_to_350._304_RangeSumQuery2DImmutable;

import com.example.leetcode.utils.myArrayUtils;

public class Main304
{
	public static void main(String[] args)
	{
	  System.out.println("304. Range Sum Query 2D - Immutable");
	  
	  System.out.println("\r\nMatrix:\r\n"+myArrayUtils.toString(matrix));

    String format = "\r\nsumRegion(%d, %d, %d, %d) -> %d";
				
		NumMatrix nm = new NumMatrix(matrix);
		
		for (int[] testcase : _testCases)
		{
	    int row1 = testcase[0];
	    int col1 = testcase[1];
	    int row2 = testcase[2];
	    int col2 = testcase[3];
	    int sum = nm.sumRegion(row1, col1, row2, col2);
	    
	    System.out.println(
	        String.format(format, row1, col1, row2, col2, sum));
		}
	}

	private static int[][] matrix = 
  { 
    { 3, 0, 1, 4, 2 },
    { 5, 6, 3, 2, 1 },
    { 1, 2, 0, 1, 5 },
    { 4, 1, 0, 1, 7 },
    { 1, 0, 3, 0, 5 } 
  };
	
	private static int[][] _testCases = 
	{
	    { 2, 1, 4, 3 }   // Ans is 8
	  , { 1, 1, 2, 2 }   // Ans is 11
	  , { 1, 2, 2, 4 }   // Ans is 12
	};
}
