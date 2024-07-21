package com.example.leetcode._351_to_400._367_ValidPerfectSquare;

/*
 * 可以利用公式：1+3+5+..+(2N-1) == N^2; 
 */

public class Solution367v4 implements Solution367
{
  public boolean isPerfectSquare(int num) 
  {
    long L = 1, R = (num >> 1) + 1;
    
    while (L <= R) 
    {
      long  m = L + ((R - L) >> 1);
      long  mul = m * m;

      if (mul == num) return true;
      else if (mul > num) R = m - 1;
      else L = m + 1;
    }
    return false;
  }
}
