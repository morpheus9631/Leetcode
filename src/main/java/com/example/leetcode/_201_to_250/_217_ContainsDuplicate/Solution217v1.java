package com.example.leetcode._201_to_250._217_ContainsDuplicate;

import java.util.HashSet;
import java.util.Set;

public class Solution217v1 implements Solution217
{
  public boolean containsDuplicate(int[] nums) 
  {
    if (nums == null) throw new IllegalArgumentException("Illegal array");
    
    if (nums.length == 0 || nums.length == 1) return false;
    
    Set<Integer> set = new HashSet<Integer>();
    for (int num : nums) {
      if (!set.add(num)) return true;
    }
    
    return false; 
  }
}
