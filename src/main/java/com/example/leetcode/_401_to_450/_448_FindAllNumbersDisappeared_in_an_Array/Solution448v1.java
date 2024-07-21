package com.example.leetcode._401_to_450._448_FindAllNumbersDisappeared_in_an_Array;

import java.util.ArrayList;
import java.util.List;

public class Solution448v1 implements Solution448
{
  public List<Integer> findDisappearedNumbers(int[] nums)
  {
    List<Integer> list = new ArrayList<Integer>();

    int[] bar = new int[nums.length+1];
    for (int num : nums) {
      bar[num]++;
    }
    
    for (int i=1; i<=nums.length; i++) {
      if (bar[i] == 0) list.add(i);
    }
    
    return list;
  }
}
