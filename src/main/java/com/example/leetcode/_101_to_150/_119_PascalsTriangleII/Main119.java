package com.example.leetcode._101_to_150._119_PascalsTriangleII;

import java.util.List;

public class Main119
{
  public static void main(String[] args)
  {
    System.out.println("119. Pascal's Triangle II");
    
    String format = "\r\nk = %d"
                  + "\r\nReturn: %s"
                  ;
    
    Solution119v2 sol = new Solution119v2();

    int k = 3;
    List<Integer> res = sol.getRow(k);

    System.out.println(String.format(format, k, res.toString()));
  }
  
  
}
