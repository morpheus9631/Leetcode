package com.example.leetcode._201_to_250._231_PowerOfTwo;

/*
 * Your runtime beats 2.44% of java submissions.
 */

public class Solution231v2 implements Solution231
{
  public boolean isPowerOfTwo(int n) 
  {
    if (n <= 0) return false;
    double power = Math.log10(n) / Math.log10(2);
    return (power == Math.ceil(power));
  }
}
