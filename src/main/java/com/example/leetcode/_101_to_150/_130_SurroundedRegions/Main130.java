package com.example.leetcode._101_to_150._130_SurroundedRegions;

import com.example.leetcode.utils.myArrayUtils;

public class Main130
{
	public static void main(String[] args)
	{
	  System.out.println("130. Surrounded Regions");
	  
	  String format = "\r\nSrc:\r\n%s"
	                + "\r\n\r\nReturn:\r\n%s"
	                ;

    Solution130 sol = new Solution130v1();
    
    for (String[] testcase : _testCases)
    {
      char[][] board = toBoard(testcase);
      String str1 = myArrayUtils.toString(board);
      
      sol.solve(board);
      String str2 = myArrayUtils.toString(board);
      
      System.out.println(String.format(format, str1, str2));
    }
	  
		
	}
	
	private static String[][] _testCases = 
	{
	  { "XXXX", "XOOX", "XXOX", "XOXX" },
	  { "OOO", "OOO", "OOO" },
	  { 
	    "XOOOOOOOOOOOOOOOOOOO",
      "OXOOOOXOOOOOOOOOOOXX",
      "OOOOOOOOXOOOOOOOOOOX",
      "OOXOOOOOOOOOOOOOOOXO",
      "OOOOOXOOOOXOOOOOXOOX",
      "XOOOXOOOOOXOXOXOXOXO",
      "OOOOXOOXOOOOOXOOXOOO",
      "XOOOXXXOXOOOOXXOXOOO",
      "OOOOOXXXXOOOOXOOXOOO",
      "XOOOOXOOOOOOXXOOXOOX",
      "OOOOOOOOOOXOOXOOOXOX",
      "OOOOXOXOOXXOOOOOXOOO",
      "XXOOOOOXOOOOOOOOOOOO",
      "OXOXOOOXOXOOOXOXOXOO",
      "OOXOOOOOOOXOOOOOXOXO",
      "XXOOOOOOOOXOXXOOOXOO",
      "OOXOOOOOOOXOOXOXOXOO",
      "OOOXOOOOOXXXOOXOOOXO",
      "OOOOOOOOOOOOOOOOOOOO",
      "XOOOOXOOOXXOOXOXOXOO"
    }
	};
	
	private static char[][] toBoard(String[] testcase)
	{
    int rows = testcase.length;
    int cols = testcase[0].length();
    char[][] board = new char[rows][cols];
    
    for (int i=0; i<rows; i++)
    {
      char[] array = testcase[i].toCharArray();
      for (int j=0; j<cols; j++) {
        board[i][j] = array[j];
      }
    }
    return board;
	}
}

