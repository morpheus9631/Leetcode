package com.example.leetcode._351_to_400._377_CombinationSumIV;

import java.util.Arrays;

public class Main377
{
	public static void main(String[] args)
	{
	  System.out.println("377. Combination Sum IV");
	  
	  String format = "\r\nnums = %s"
	                + "\r\nTraget = %d"
	                + "\r\nOutput is %d"
	                ;
	  
		Solution377 s = new Solution377v1();
		
		for (int[][] testcase : _testCases)
		{
		  int target = testcase[0][0];
		  int[] nums =testcase[1];
	    int val = s.combinationSum4(nums, target);

	    System.out.println(String.format(format, 
	        Arrays.toString(nums), target, val));
		}
	}
	
	private static int[][][] _testCases = 
	{
	  { {4}, {1,2,3} }    
	};
}
