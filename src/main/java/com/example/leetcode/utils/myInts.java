package com.example.leetcode.utils;

import java.util.LinkedList;
import java.util.List;

public class myInts
{
  public static List<Integer> asList(final int[] nums)
  {
    if (nums == null || nums.length == 0) return null;

    List<Integer> list = new LinkedList<Integer>();
    for (int num : nums) list.add(num);
    return list;
  }
}
