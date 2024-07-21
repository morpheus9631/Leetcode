package com.example.leetcode._151_to_200._200_NumberOfIslands;

import com.example.leetcode.utils.myArrayUtils;
import com.example.leetcode.utils.myStringUtils;

public class Main200
{
  public static void main(String[] args)
  {
    System.out.println("200. Number of Islands");
    
    String format = "\r\nMap:"
                  + "\r\n%s" 
                  + "\r\n\r\nThe number of islands is %d"
                  + "\r\n\r\n" + myStringUtils.dashLine(); 
    
    Solution200 sol = new Solution200v1();
    
    for (String[] testcase : _testCases)
    {
      char[][] map = myStringUtils.toArray(testcase);
      String mapStr = myArrayUtils.toString(map);

      int num = sol.numIslands(map);
      
      System.out.println(
          String.format(format, mapStr, num));
    }
  }
  
  private static String[][] _testCases = 
  {
      { "11110", "11010", "11000", "00000" }
    , { "11000", "11000", "00100", "00011" }
  };
}
