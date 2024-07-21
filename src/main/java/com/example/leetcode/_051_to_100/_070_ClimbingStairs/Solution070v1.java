package com.example.leetcode._051_to_100._070_ClimbingStairs;

import java.util.ArrayList;
import java.util.List;

/*
 * Time Limit Exceeded when n = 35
 */

public class Solution070v1 implements Solution070
{
  public int climbStairs(int n)
  {
    List<List<Integer>> listList = new ArrayList<List<Integer>>(); 
    DFS(n, 0, new ArrayList<Integer>(), listList);
    return listList.size();
  }
  
  private void DFS(int n, int steps, List<Integer> list, 
      List<List<Integer>> listList)
  {
    if (steps > n) return;
    
    if (steps == n) 
    {
      System.out.println(list.toString());
      listList.add(list);
      return;
    }
    
    list.add(1);
    DFS(n, steps+1, list, listList);
    list.remove(list.size()-1);
    
    list.add(2);
    DFS(n, steps+2, list, listList);
    list.remove(list.size()-1);
  }
}
