package com.example.leetcode._051_to_100._053_MaximumSubarray;

public class Solution053v1 implements Solution053
{
  public int maxSubArray(int[] nums) 
  {
    int maxSum = nums[0];
    int len = nums.length;
    
    for (int i=0; i<len; i++)
    {
      int sum = nums[i]; 
      if (sum > maxSum) maxSum = sum;
      
      for (int j=i+1; j<len; j++)
      {
        sum += nums[j];
        if (sum > maxSum) maxSum = sum;
      }
    }
    
    return maxSum;
  }
}
