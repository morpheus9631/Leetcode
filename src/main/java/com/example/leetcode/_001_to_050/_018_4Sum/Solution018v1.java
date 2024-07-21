package com.example.leetcode._001_to_050._018_4Sum;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Solution018v1 implements Solution018
{
  public List<List<Integer>> fourSum(int[] nums, int target) 
  {
    List<List<Integer>> res = new ArrayList<List<Integer>>();
    
    Arrays.sort(nums);
    DFS(nums, target, 0, res, new ArrayList<Integer>());
    return res;
  }
  
  private void DFS(int[] nums, int target, int idx, List<List<Integer>> res
      , List<Integer> list)
  {
    if (list.size() > 4) return;
    
    if (list.size() == 4 && target == 0)
    {
      Collections.sort(list);
      if (!res.contains(list)) res.add(new ArrayList<Integer>(list));
      return;
    }
    
    for (int i=idx; i<nums.length; i++)
    {
      if (i != 0 && nums[i] == nums[i-1]) continue;
      
      Integer num = nums[i]; 
      list.add(num);
      DFS(nums, target-num, i+1, res, list);
      list.remove(num);
    }
  }
}
