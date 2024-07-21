package com.example.leetcode._151_to_200._152_MaximumProductSubarray;

public class Solution152v1 implements Solution152
{
  public int maxProduct(int[] nums) 
  {
    int res = -1;
    
    if (nums == null) 
      throw new IllegalArgumentException("Illegal Array");
    
    int len = nums.length; 
    if (len == 0) return 0;
    if (len == 1) return nums[0];

    res = nums[0];
    int max = nums[0];
    int min = nums[0];
    int maxTmp = nums[0];
    int minTmp = nums[0];
    
    for(int i=1; i<nums.length; i++)
    {
      maxTmp = max * nums[i];
      minTmp = min * nums[i];
      max = Math.max(nums[i], Math.max(maxTmp, minTmp));
      min = Math.min(nums[i], Math.min(maxTmp, minTmp));
      res = Math.max(res, max);
    }
    return res;    
  }
}
