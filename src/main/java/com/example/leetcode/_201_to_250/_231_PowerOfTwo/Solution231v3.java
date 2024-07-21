package com.example.leetcode._201_to_250._231_PowerOfTwo;

/*
 * Your runtime beats 25.04% of java submissions.
 */

public class Solution231v3 implements Solution231
{
  public boolean isPowerOfTwo(int n) 
  {
    if (n <= 0) return false;
    
    while (n > 1)
    {
      if (((1 & n) == 1) && ((n >> 1) > 0)) return false;
      n >>= 1;
    }
    
    return (n == 1);
  }
}
