package com.example.leetcode._201_to_250._238_ProductOfArrayExceptSelf;

import java.util.Arrays;

public class Main238
{
	public static void main(String[] args)
	{
	  System.out.println("238. Product of Array Except Self");
	  
	  String format = "\r\nS = %s"
	                + "\r\nReturn: %s"
	                ;
	  
		Solution238 sol = new Solution238v1();

		for (int[] nums : _testCases)
		{
	    int[] vals = sol.productExceptSelf(nums);
	    
	    System.out.println(String.format(format, 
	        Arrays.toString(nums), Arrays.toString(vals)));
		}
	}
	
	private static int[][] _testCases = 
	{
	    {1,2,3,4}  // return [24,12,8,6]
	  , {9,0,-2}   // return [0,-18,0]
	};
}
