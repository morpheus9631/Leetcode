package com.example.leetcode._051_to_100._070_ClimbingStairs;

/*
 * Time Limit Exceeded when n >= 42
 */

public class Solution070v3 implements Solution070 
{
  public int climbStairs(int n)
  {
    if (n <= 1) return 1;
    return climbStairs(n-1) + climbStairs(n-2);
  }
}
