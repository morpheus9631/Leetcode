package com.example.leetcode._201_to_250._219_ContainsDuplicateII;

import java.util.HashMap;
import java.util.Map;

/*
 * 2016.10.12: 1.89%
 * 
 */
public class Solution219v1 implements Solution219
{
  public boolean containsNearbyDuplicate(int[] nums, int k) 
  {
    Map<Integer, Integer> map = new HashMap<Integer, Integer>();
    
    for (int i=0; i<nums.length; i++)
    {
      int key = nums[i];
      if (!map.containsKey(key)) 
      {
        map.put(key, i);
        continue;
      }  

      if (i - map.get(key) <= k) 
        return true;
      else
        map.put(key, i);
    }
    
    return false;
  }
}
