package com.example.leetcode._101_to_150._119_PascalsTriangleII;

import java.util.ArrayList;
import java.util.List;

public class Solution119v1 implements Solution119
{
  public List<Integer> getRow(int rowIndex) 
  {
    List<Integer> res = new ArrayList<Integer>();

    res.add(1);
    if (rowIndex == 0) return res;
    
    res.add(1);
    if (rowIndex == 1) return res;
    
    int level = 1;
    while(level++ < rowIndex)
    {
      List<Integer> list = new ArrayList<Integer>();
      
      for (int i=0; i<res.size(); i++) 
      {
        if (i == 0) 
        { 
          list.add(res.get(i));
          continue;
        }  

        int val = res.get(i) + res.get(i-1);
        list.add(i, val);
        
        if (i == res.size()-1) list.add(res.get(i));
      }
      res = list;
    }
    
    return res;
  }
}
