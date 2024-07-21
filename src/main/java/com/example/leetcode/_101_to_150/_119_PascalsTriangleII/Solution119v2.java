package com.example.leetcode._101_to_150._119_PascalsTriangleII;

import java.util.Arrays;
import java.util.List;

public class Solution119v2 implements Solution119
{
  public List<Integer> getRow(int rowIndex) 
  {
    Integer[] vals = new Integer[rowIndex+1];
    Arrays.fill(vals, 0); 
    
    if (rowIndex < 0) return null;
    
    vals[0] = 1;
    if (rowIndex == 0) return Arrays.asList(vals);
    
    for (int row=1; row<=rowIndex; row++)
    {
      for (int col=row; col>=0; col--)
      {
        if (col == 0 || col == row)
          vals[col] = 1;
        else
          vals[col] = vals[col] + vals[col-1];
      }
    }
    
    return Arrays.asList(vals);
  }
}
