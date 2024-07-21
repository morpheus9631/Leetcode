package com.example.leetcode._051_to_100._070_ClimbingStairs;

/*
 * Your runtime beats 14.45% of java submissions.
 */

public class Solution070v4 implements Solution070 
{
  public int climbStairs(int n)
  {
    if (n <= 1) return 1;

    int count = 2;
    int a = 1, b = 1, tmp = 2;
    while(count++ < n) 
    {
      a = b;
      b = tmp;
      tmp = a + b;
    }
    return tmp;  
  }
}
