package com.example.leetcode._101_to_150._118_PascalsTriangle;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
 * Your runtime beats 32.81% of java submissions.
 */

public class Solution118v1 implements Solution118
{
  public List<List<Integer>> generate(int numRows) 
  {
    List<List<Integer>> listList = new ArrayList<List<Integer>>();
    if (numRows == 0) return listList;
    
    List<Integer> preList = new ArrayList<Integer>(Arrays.asList(1));
    listList.add(preList);
    if (numRows == 1) return listList;
    
    for (int i=2; i<=numRows; i++)
    {
      List<Integer> curList = new ArrayList<Integer>();
      curList.add(1);
      
      for (int j=0; j<preList.size()-1; j++)
        curList.add(preList.get(j) + preList.get(j+1));

      curList.add(1);

      listList.add(curList);
      preList = curList;
    }
    
    return listList;
  }
}
