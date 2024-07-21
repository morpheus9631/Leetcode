package com.example.leetcode._051_to_100._069_Sqrt_of_x;

/*
 * Your runtime beats 56.75 % of java submissions.
 */
    
public class Solution069v2 implements Solution069
{
  @Override
  public int mySqrt(int x)
  {
    if (x <= 0) return 0;
    if (x == 1) return 1;
    
    long mid = (long) x / 2;
    while (mid * mid > x) {
      mid /= 2;
    }
    
    while (mid*mid <= x) {
      mid++;
    }
    
    return (int)(mid - 1);
  }
}