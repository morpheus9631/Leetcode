package com.example.leetcode._051_to_100._070_ClimbingStairs;

/*
 * Your runtime beats 14.45% of java submissions.
 */

public class Solution070v5 implements Solution070
{
  public int climbStairs(int n)
  {
    if (n <= 1) return 1;
    
    int[] array = new int[n];
    array[0] = 1;
    array[1] = 2;
    
    for (int i=2; i<n; i++) {
      array[i] = array[i-1] + array[i-2];
    }
    return array[n-1];
  }
}
