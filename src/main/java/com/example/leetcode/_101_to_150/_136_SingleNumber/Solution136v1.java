package com.example.leetcode._101_to_150._136_SingleNumber;

import java.util.HashMap;

/*
 * Your runtime beats 8.43% of java submissions.
 */
public class Solution136v1 implements Solution136
{
  public int singleNumber(int[] nums) 
  {
    HashMap<Integer, Integer> map = new HashMap<Integer, Integer>(); 
    
    for (int num : nums)
    {
      if (!map.containsKey(num)) 
        map.put(num, 1);
      else
        map.remove(num);
    }
    return (int) map.keySet().toArray()[0];
  }
}
