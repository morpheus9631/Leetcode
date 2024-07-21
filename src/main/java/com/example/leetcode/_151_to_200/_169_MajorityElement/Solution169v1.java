package com.example.leetcode._151_to_200._169_MajorityElement;

import java.util.Hashtable;

public class Solution169v1 implements Solution169
{
  public int majorityElement(int[] nums) 
  {
    int maxNum = Integer.MIN_VALUE;
    
    if (nums == null) throw new IllegalArgumentException("Illegal array");
    if (nums.length == 0) return 0;
    
    Hashtable<Integer, Integer> table = new Hashtable<Integer, Integer>();

    int maxCnt = 0; 
    for (int num : nums)
    {
      if (!table.containsKey(num)) table.put(num, 0);
      int cnt = table.get(num) + 1;
      table.put(num, cnt);
      
      if (cnt > maxCnt)
      {
        maxCnt = cnt;
        maxNum = num;
      }
    }
    if (maxCnt <= (nums.length / 2)) maxNum = Integer.MIN_VALUE;
    
    return maxNum;
  }
}
