package com.example.leetcode._101_to_150._136_SingleNumber;

/*
 * Your runtime beats 40.44% of java submissions.
 */
public class Solution136v2 implements Solution136
{
  public int singleNumber(int[] nums) 
  {
    if (nums == null || nums.length == 0) return -1;
    
    int res = 0;
    for (int i=0; i<nums.length; i++) res ^= nums[i];
    return res;
  }
}
