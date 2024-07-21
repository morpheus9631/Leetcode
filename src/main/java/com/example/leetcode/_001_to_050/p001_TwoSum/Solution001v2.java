package com.example.leetcode._001_to_050.p001_TwoSum;

public class Solution001v2 implements Solution001
{
  public int[] twoSum(int[] nums, int target)
  {
    if (nums == null) return  null;
    if (nums.length < 2) return null;
    
    int[] idxs = new int[2];
    
    int len = nums.length;
    
    outerloop:
    for (int i=0; i<len-1; i++)
    {
      for (int j=i+1; j<len; j++)
      {
        if (nums[i] + nums[j] == target)
        {
          idxs[0] = i;
          idxs[1] = j;
          break outerloop;
        }
      }
    }
    
    return idxs;
  }
}
