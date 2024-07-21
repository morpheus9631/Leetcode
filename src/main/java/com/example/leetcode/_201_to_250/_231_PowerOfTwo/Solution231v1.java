package com.example.leetcode._201_to_250._231_PowerOfTwo;

/*
 * Your runtime beats 5.79% of java submissions.
 */

public class Solution231v1 implements Solution231
{
  public boolean isPowerOfTwo(int n) 
  {
    if (n <= 0) return false;
    
    while (n > 1)
    {
      if (n%2 != 0) return false;
      n /= 2;
    }
    return true;
  }
}
