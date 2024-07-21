package com.example.leetcode._001_to_050.p001_TwoSum;

import java.util.HashMap;

public class Solution04 implements Solution001
{
  public int[] twoSum(int[] nums, int target)
  {
    if (nums == null) return  null;
    if (nums.length < 2) return null;
    
    int[] idxs = new int[2];
    
    HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
    
    int len = nums.length;
    for (int i=0; i<len; i++) {
      map.put(nums[i], i);
    }
    
    for (int i=0; i<len; i++)
    {
      idxs[0] = i;
      int num2 = target - nums[i];
      
      if (map.containsKey(num2) && map.get(num2) != i)
      {
        idxs[1] = map.get(num2);
        break;
      }
    }
    return idxs;
  }
}
