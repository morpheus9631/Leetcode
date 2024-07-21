package com.example.leetcode._301_to_350._349_Intersection_of_TwoArrays;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

/*
 * Your runtime beats 2.90% of java submissions.
 */
public class Solution349v1 implements Solution349 
{
  public int[] intersection(int[] nums1, int[] nums2)
  {
    if (nums1 == null || nums2 == null) return null;
    
    Set<Integer> set = new HashSet<Integer>();
    for (int n : nums1) set.add(new Integer(n));
    
    List<Integer> list = new LinkedList<Integer>();
    for (int n : nums2)
    {
      if (set.contains(new Integer(n)) &&
          !list.contains(new Integer(n)))
        list.add(new Integer(n));
    }
    
    return list.stream().mapToInt(i->i).toArray();
  }
}
