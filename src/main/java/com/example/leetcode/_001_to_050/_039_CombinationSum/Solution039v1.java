package com.example.leetcode._001_to_050._039_CombinationSum;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Solution039v1 implements Solution039
{
  public List<List<Integer>> combinationSum(int[] candidates, int target) 
  {
    List<List<Integer>> res = new ArrayList<List<Integer>>();
   
    if (candidates == null) return res;
    if (candidates.length == 0) return res;
    if (target == 0) return res;

    Arrays.sort(candidates);
    List<Integer> path = new ArrayList<Integer>();
    DFS(candidates, target, 0, 0, path, res);
    
    return res;
  }
  
  private void DFS(int[] candidates, int target, int sum, int index 
      , List<Integer> path, List<List<Integer>> result)
  {
    if (target == sum) 
    {
      Collections.sort(path);
      if (!result.contains(path)) 
        result.add(new ArrayList<Integer>(path));
      return;
    }
    
    if (sum > target) return;
    
    for (int i=index; i<candidates.length; i++) 
    {
      Integer candidate = candidates[i];
      if (target-sum < candidate) break;
      path.add(candidate);
      DFS(candidates, target, sum+candidate, i, path, result);
      path.remove(candidate);
    }
  }
}
