package com.example.leetcode._351_to_400._377_CombinationSumIV;

public class Solution377v1 implements Solution377
{
  public int combinationSum4(int[] nums, int target) 
  {
    int[] dp= new int[target+1];
    
    dp[0] = 1; // target 和  num 相等時只有一個解
    
    
    // 全部的 target 依序和  nums[i] 比較時有多少個解
    for(int i = 1; i <= target; i++)
    {
      for(int num:nums) 
      {
        if(i >= num) dp[i] += dp[i-num]; 
      }
    }
   
    return dp[target];
  }
}
