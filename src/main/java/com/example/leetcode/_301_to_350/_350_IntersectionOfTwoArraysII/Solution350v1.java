package com.example.leetcode._301_to_350._350_IntersectionOfTwoArraysII;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

/*
 * Your runtime beats 48.29% of java submissions.
 */
public class Solution350v1 implements Solution350
{
  public int[] intersect(int[] nums1, int[] nums2) 
  {
    if (nums1 == null || nums2 == null) return null;
    
    Map<Integer, Integer> map = new HashMap<Integer, Integer>();
    
    for (int key : nums1)
    {
      int val = (!map.containsKey(key)) ? 1 : map.get(key) + 1;
      map.put(key, val);
    }
    
    List<Integer> list = new LinkedList<Integer>();
    for (int key : nums2)
    {
      if (!map.containsKey(key)) continue;

      int val = map.get(key) - 1;
      
      if (val == 0)
        map.remove(key);
      else
        map.put(key, val);
        
      list.add(new Integer(key));
    }
    
    int i = 0;
    int[] array = new int[list.size()];
    for (Integer num : list) array[i++] = num;
    
    return array;
  }
}
