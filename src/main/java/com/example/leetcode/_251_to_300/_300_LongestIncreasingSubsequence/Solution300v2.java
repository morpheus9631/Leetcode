package com.example.leetcode._251_to_300._300_LongestIncreasingSubsequence;

public class Solution300v2  implements Solution300
{
  public int lengthOfLIS(int[] nums) 
  {
    int maxlen = 0;

    int[] dp = new int[nums.length];
    for (int i=0; i<nums.length; i++)
    {
      dp[i] = 1;
      for (int j=i-1; j>=0; j--)
      {
        if (nums[j] < nums[i] && dp[j]+1 > dp[i]) 
          dp[i] = dp[j]+1;
      }
      
      if (dp[i] > maxlen) maxlen = dp[i];
    }
    
    return maxlen;
  }
  
}
