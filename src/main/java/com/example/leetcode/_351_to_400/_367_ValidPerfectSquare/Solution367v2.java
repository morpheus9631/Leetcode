package com.example.leetcode._351_to_400._367_ValidPerfectSquare;

/*
 * 可以利用公式：1+3+5+..+(2N-1) == N^2; 
 */

public class Solution367v2 implements Solution367
{
  public boolean isPerfectSquare(int num) 
  {
    if (num < 1) return false;
    for (int i=1; num>0; i+=2) num -= i;
    return 0 == num;
  }
}
