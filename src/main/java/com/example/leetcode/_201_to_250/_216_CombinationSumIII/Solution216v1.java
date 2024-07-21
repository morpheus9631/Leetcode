package com.example.leetcode._201_to_250._216_CombinationSumIII;

import java.util.ArrayList;
import java.util.List;

public class Solution216v1 implements Solution216
{
  public List<List<Integer>> combinationSum3(int k, int n) 
  {
    List<List<Integer>> res = new ArrayList<List<Integer>>();
    
    if (n < 3) return res;
    
    int[] nums = new int[9];
    for (int i=1; i<=9; i++) nums[i-1] = i;

    DFS(nums, k, n, 0, res, new ArrayList<Integer>());
    
    return res;
  }
  
  
  private void DFS(int[] nums, int len, int target, int idx
      , List<List<Integer>> res, List<Integer> list)
  {
    if (list.size() > len) return;
    
    if (target == 0 && list.size() == len) {
      res.add(new ArrayList<Integer>(list));
    }
    
    for (int i=idx; i<nums.length; i++)
    {
      Integer num = nums[i];
      if (num > target) return;
        
      list.add(num);
      DFS(nums, len, target-num, i+1, res, list);
      list.remove(num);
    }
  }
}
