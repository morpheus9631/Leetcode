package com.example.leetcode._401_to_450._441_ArrangingCoins;

/*
 * Your runtime beats 46.37 % of java submissions.
 */

/*
 * ((1+R) x R) / 2 = n
 * R^2 + R - 2n = 0 
 * R = (-1 + sqrt( 1^2 - 4 x 1 x (-2n))) / (2 x 1)
 * R = -0.5 + sqrt (0.25 + 2n)
 */

public class Solution441v1 implements Solution441
{
  public int arrangeCoins(int n) 
  {
    return (int) (Math.sqrt(0.25 + 2 * (long) n) - 0.5);
  }
}
