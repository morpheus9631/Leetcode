package com.example.leetcode._101_to_150._118_PascalsTriangle;

import java.util.ArrayList;
import java.util.List;

/*
 * Your runtime beats 32.81% of java submissions.
 */

public class Solution118v2 implements Solution118
{
  public List<List<Integer>> generate(int numRows) 
  {
    List<List<Integer>> listList = new ArrayList<List<Integer>>();
    if (numRows == 0) return listList;
    
    List<Integer> list = new ArrayList<Integer>();

    for (int i=1; i<=numRows; i++)
    {
      list.add(1);
      
      List<Integer> tmpList = new ArrayList<Integer>(list);
      for (int j=0; j<i-2; j++)
        list.set(j+1, tmpList.get(j)+tmpList.get(j+1));
      
      listList.add(new ArrayList<Integer>(list));
    }
    
    return listList;
  }
}
