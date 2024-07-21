package com.example.leetcode._301_to_350._349_Intersection_of_TwoArrays;

import java.util.HashSet;
import java.util.Set;

/*
 * Your runtime beats 0.97% of java submissions.
 */
public class Solution349v2 implements Solution349 
{
  public int[] intersection(int[] nums1, int[] nums2)
  {
    if (nums1 == null || nums2 == null) return null;
    
    Set<Integer> set1 = new HashSet<Integer>();
    for (int n : nums1) set1.add(n);
    
    Set<Integer> set2 = new HashSet<Integer>();
    for (int n : nums2) {
      if (set1.contains(n)) set2.add(n);
    }
    
    return set2.stream().mapToInt(i->i).toArray();
  }
}
