package com.example.leetcode._401_to_450._414_ThirdMaximumNumber;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Solution414v1 implements Solution414
{
  public int thirdMax(int[] nums) 
  {
    if (nums.length == 1) return nums[0];
    
    if (nums.length == 2) 
      return (nums[0] > nums[1] ? nums[0] : nums[1]); 

    List<Integer> list = new LinkedList<Integer>();
    for (Integer n : nums) if (!list.contains(n)) list.add(n);
    
    Collections.sort(list);
    System.out.println(list.toString());
    
    int size = list.size();
    int res = (size < 3) ? list.get(size-1) : list.get(size-3);
    return res;
  }
}
