package com.example.leetcode._051_to_100._070_ClimbingStairs;

/*
 * Time Limit Exceeded when n = 38
 */

public class Solution070v2 implements Solution070
{
  int ways = 0;
  
  public int climbStairs(int n)
  {
    if (n <= 1) return 1;
    
    DFS(n, 0);
    return ways;
  }
  
  private void DFS(int n, int steps)
  {
    if (steps > n) return;
    
    if (steps == n) 
    {
      ways++;
      return;
    }
    
    DFS(n, steps+1);
    DFS(n, steps+2);
  }
}
