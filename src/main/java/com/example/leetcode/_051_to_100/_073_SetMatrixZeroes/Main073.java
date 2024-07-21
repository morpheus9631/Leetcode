package com.example.leetcode._051_to_100._073_SetMatrixZeroes;

import com.example.leetcode.utils.myArrayUtils;
import com.example.leetcode.utils.myStringUtils;

public class Main073
{

	public static void main(String[] args)
	{
    System.out.println("73. Set Matrix Zeroes");
		
    String format = "\r\nBeftor:\r\n%s"
                  + "\r\n\r\nAfter:\r\n%s"
                  + "\r\n\r\n" + myStringUtils.dashLine();
    
		Solution073 sol = new Solution073v1();
		
		for (int[][] testcase : _testCases)
		{
		  String str1 = myArrayUtils.toString(testcase);
		  
	    sol.setZeroes(testcase);
      String str2 = myArrayUtils.toString(testcase);
      
      System.out.println(String.format(format, str1, str2));
		}
	}

	private static int[][][] _testCases = 
	{
	  { {1,2,3}, {1,0,3}, {1,1,1} },
	  { {4,5,2,1,0}, {0,2,3,7,9}, {1,4,3,2,8}, {6,1,3,4,5}, {1,6,0,8,4} },
	  { {0,0,0,5}, {4,3,1,4}, {0,1,1,4}, {1,2,1,3}, {0,0,1,1} }
	};
}
