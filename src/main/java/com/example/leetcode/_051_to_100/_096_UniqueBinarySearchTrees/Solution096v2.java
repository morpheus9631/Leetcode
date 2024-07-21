package com.example.leetcode._051_to_100._096_UniqueBinarySearchTrees;

public class Solution096v2 implements Solution096
{
  public int numTrees(int n) 
  {
    if (n <= 0) return 0;
    
    int[] dp = new int[n+1];
    dp[0] = 1;
    
    for (int i = 1; i < dp.length; i++)
    {
      for (int k = 0; k <= i-1; k++) 
      {
        dp[i] += dp[k] * dp[i-k-1];
      }
    }

    return dp[n];
  }
}
