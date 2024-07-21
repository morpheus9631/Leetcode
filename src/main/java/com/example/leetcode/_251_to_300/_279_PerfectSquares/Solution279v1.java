package com.example.leetcode._251_to_300._279_PerfectSquares;

import java.util.ArrayList;
import java.util.List;

public class Solution279v1 implements Solution279
{
  private int minSize = -1;
  
  public int numSquares(int n) 
  {
    if (n < 4) return n;
    
    minSize = n;
    
    int factor = (int) Math.sqrt(n);
    int[] nums = new int[factor];
    for (int i=0; i<factor; i++) { 
      nums[i] = (factor-i) * (factor-i);
    }
    
    List<List<Integer>> res = new ArrayList<List<Integer>>();
    DFS(nums, n, res, new ArrayList<Integer>());
      
    return minSize;
    
  }
  
  private void DFS(int[] nums, int target, List<List<Integer>> res
      , List<Integer> list)
  {
    if (target == 0 && list.size() < minSize) 
    {
      minSize = list.size();
      res.add(new ArrayList<Integer>(list));
      return;
    }
    
    int len = nums.length;
    for (int i=0; i<len; i++)
    {
      int num = nums[i]; 
      if (num > target) continue;
      
      int div = target / num;
      if (list.size() + div > minSize) continue;
      
      while (div > 0) { list.add(num); div--; };
      DFS(nums, target%num, res, list);
      while (list.contains(num)) 
        list.remove(Integer.valueOf(num));
    }
    
    return;
  }
}
