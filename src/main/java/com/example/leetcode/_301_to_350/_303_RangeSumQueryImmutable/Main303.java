package com.example.leetcode._301_to_350._303_RangeSumQueryImmutable;

import java.util.Arrays;

public class Main303
{

	public static void main(String[] args)
	{
	  System.out.println("303. Range Sum Query - Immutable");
	  
    int[] array = { -2, 0, 3, -5, 2, -1 };
	  System.out.println("\r\nS = "+Arrays.toString(array));
	  
	  String format = "\r\nsumRange(%d, %d) -> %d";
	      
		NumArray na = new NumArray(array);
		
		for (int[] testcase : _testCases)
		{
		  int num1 = testcase[0];
		  int num2 = testcase[1];
		  int val = na.sumRange(num1, num2);
		  
		  System.out.println(String.format(format, num1, num2, val));
		}
	}

	private static int[][] _testCases = 
	{
	    {0, 2}     // sumRange(0, 2) -> 1
	  , {2, 5}     // numRange(2, 5) -> -1
	  , {0, 5}     // sumRange(0, 5) -> -3
	};
}
