package com.example.leetcode._351_to_400._368_LargestDivisibleSubset;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Solution368v1 implements Solution368
{
  public List<Integer> largestDivisibleSubset(int[] nums) 
  {
    List<Integer> res = new LinkedList<Integer>();
    
    if (nums == null || nums.length == 0) return res;
    
    Arrays.sort(nums);
    
    int len = nums.length;
    int[] dp = new int[len];     Arrays.fill(dp, 1);
    int[] preIdx = new int[len]; Arrays.fill(preIdx, -1);
    
    int maxNum = 0, idx = -1;
    for (int i=0; i<len; i++)
    {
      for (int j=0; j<i; j++)
      {
        if (nums[i] % nums[j] == 0 && dp[i] < dp[j]+1)
        {
          dp[i] = dp[j] + 1;
          preIdx[i] = j;
        }
      }
      
      if (dp[i] > maxNum) 
      {
        maxNum = dp[i];
        idx = i;
      }
    }
    
    while (idx >= 0)
    {
      ((LinkedList<Integer>) res).addFirst(nums[idx]);
      idx = preIdx[idx];
    }
    
    return res;
  }
}
