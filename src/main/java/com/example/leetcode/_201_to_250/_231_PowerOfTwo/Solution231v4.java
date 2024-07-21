package com.example.leetcode._201_to_250._231_PowerOfTwo;

/*
 * Your runtime beats 25.04% of java submissions.
 */

public class Solution231v4 implements Solution231
{
  public boolean isPowerOfTwo(int n) 
  {
    if (n < 1) return false;
    return ((n & (n-1)) == 0);  
  }
}
