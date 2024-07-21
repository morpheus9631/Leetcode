package com.example.leetcode._151_to_200._198_HouseRobber;

/*
 * Your runtime beats 43.15% of java submissions.
 */

public class Solution198v1 implements Solution198
{
  public int rob(int[] nums) 
  {
    if (nums == null || nums.length == 0) return 0;
  
    if (nums.length <= 2)
      return Math.max(nums[0], nums[nums.length-1]);
  
    int[] dp = new int[nums.length];
    dp[0] = nums[0];
    dp[1] = nums[1];
    dp[2] = nums[0] + nums[2];
    
    for(int i=3; i<nums.length; i++) {
      dp[i] = nums[i] + Math.max(dp[i-2], dp[i-3]);
    }
  
    return Math.max(dp[nums.length-1], dp[nums.length-2]);  
  }
}
