package com.example.leetcode._201_to_250._209_MinimumSizeSubarraySum;

public class Solution209v1 implements Solution209
{
  public int minSubArrayLen(int s, int[] nums) 
  {
    if (nums == null) throw new IllegalArgumentException("Illegal nums");
    
    if (nums.length == 0) return 0;
    
    int sum = 0; 
    int min = Integer.MAX_VALUE;
    
    int start = 0;
    int end = 0;
    
    while (start < nums.length && end < nums.length)
    {
      while (sum < s && end < nums.length) {
        sum += nums[end++];
      }
      
      while (sum >= s && start <= end) {
        min = Math.min(min, end-start); 
        sum -= nums[start++];
      }
    }
    
    return (min == Integer.MAX_VALUE ? 0 : min);
  }
}
