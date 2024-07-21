package com.example.leetcode._051_to_100._055_JumpGame;

/*
 * 2016.10.04:  Time Limit Exceeded
 */

public class Solution055v1 implements Solution055
{
  public boolean canJump(int[] nums) 
  {
    int len = nums.length;
    int[] dp = new int[len];
    dp[0] = 1;

    int i = 0, left = 0, right = 0;
    while (i < len)
    {
      if (dp[i] == 1)
      {
        int num = nums[i];
        if (i+num > len-1) return true;
        
        left = Math.min(i+1, len-1);
        right = Math.min(i+num, len-1);
        for (int j=left; j<=right; j++) dp[j] = 1;
      }
      i++;
    }
  
    return (dp[nums.length-1] == 1);
  }
}
