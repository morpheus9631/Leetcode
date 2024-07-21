package com.example.leetcode._251_to_300._268_MissingNumber;

public class Solution268v2 implements Solution268
{
  public int missingNumber(int[] nums) 
  {
    int sum = 0;
    int total = 0;
    for (int i=1; i<=nums.length; i++)
    {
      sum += nums[i-1];
      total += i;
    }
    return total - sum;
  }
}
