package com.example.leetcode._051_to_100._085_MaximalRectangle;

import com.example.leetcode.utils.myArrayUtils;
import com.example.leetcode.utils.myStringUtils;

public class Main085
{
	public static void main(String[] args) 
	{
	  System.out.println("85. Maximal Rectangle");
	  
	  String replaceStr = "###";
	  
	  String format = "\r\nGiven matrix:"
	                + "\r\n" + replaceStr
	                + "\r\n\r\nThe largest rectangle area is: %d"
	                + "\r\n\r\n" + myStringUtils.dashLine()
	                ;
	  
    Solution085 sol = new Solution085v1();

    for (String[] testcase : _testCases)
    {
      char[][] matrix = myStringUtils.toArray(testcase);
      
      int maxArea = sol.maximalRectangle(matrix);
      
      String outstr = String.format(format, maxArea)
                      .replace(replaceStr, myArrayUtils.toString(matrix));
      System.out.println(outstr);
    }
	}
	
	private static String[][] _testCases = 
	{
	  { "10100","10111","11111","10010" }
	};
	
//  public static void showMatrix(int[][] array)
//  {
//  	int row = array.length;
//  	int col = array[0].length;
//  	
//	  for (int i=0; i<row; i++) 
//	  {
//	    for (int j=0; j<col; j++) 
//	    {
//		    System.out.print(array[i][j] + ", ");
//	    }
//	    System.out.println("");
//    }
//    System.out.println("");
//  }
}
