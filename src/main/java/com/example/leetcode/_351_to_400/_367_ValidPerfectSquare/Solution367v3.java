package com.example.leetcode._351_to_400._367_ValidPerfectSquare;

/*
 * 可以利用公式：1+3+5+..+(2N-1) == N^2; 
 */

public class Solution367v3 implements Solution367
{
  public boolean isPerfectSquare(int num) 
  {
    long x = num;
    while (x*x > num) 
    {
      System.out.print("x1: "+x);
      x = (x + num / x) / 2;
      System.out.println(",\tx2: "+x);
    }
    return x * x == num;
  }
}
