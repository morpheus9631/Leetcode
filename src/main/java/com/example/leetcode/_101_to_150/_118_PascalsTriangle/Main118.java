package com.example.leetcode._101_to_150._118_PascalsTriangle;

import java.util.List;

import com.example.leetcode.utils.myListUtils;

public class Main118
{
  public static void main(String[] args)
  {
    System.out.println("118. Pascal's Triangle");
    
    String format = "\r\nn = %d"
                  + "\r\nReturn:\r\n%s"
                  ;
    
    Solution118 sol = new Solution118v2();
    
    for (int numRows : _testCases)
    {
      List<List<Integer>> listList = sol.generate(numRows);
      
      System.out.println(String.format(format, numRows, 
          myListUtils.toString(listList)));
    }
  }
  
  private static int[] _testCases =
  {
    2, 5
  };
}
