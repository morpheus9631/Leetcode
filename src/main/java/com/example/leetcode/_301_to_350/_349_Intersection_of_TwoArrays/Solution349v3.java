package com.example.leetcode._301_to_350._349_Intersection_of_TwoArrays;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/*
 * Your runtime beats 15.63% of java submissions.
 */
public class Solution349v3 implements Solution349 
{
  public int[] intersection(int[] nums1, int[] nums2)
  {
    if (nums1 == null || nums2 == null) return null;

    Arrays.sort(nums1);
    Arrays.sort(nums2);
    Set<Integer> set = new HashSet<Integer>();
    
    int idx1 = 0, idx2 = 0;
    while (idx1 < nums1.length && idx2 < nums2.length)
    {
      if (nums1[idx1] == nums2[idx2])
      {
        Integer num = new Integer(nums1[idx1]);
        set.add(num);
        idx1++; idx2++;
      }
      else if (nums1[idx1] < nums2[idx2])
        idx1++;
      else if (nums1[idx1] > nums2[idx2])
        idx2++;
    }
    
    int[] array = new int[set.size()];
    int i = 0;
    for (Integer num : set) array[i++] = num;
    
    return array;
  }
}
