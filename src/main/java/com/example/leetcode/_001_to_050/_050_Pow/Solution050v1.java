package com.example.leetcode._001_to_050._050_Pow;

public class Solution050v1 implements Solution050
{
  public double myPow(double x, int n) 
  {
    if (n == 0) return 1.0;
    
    double result = 1.0;
    
    boolean isNegative = (n < 0);
    double base = (isNegative) ? 1.0/x : x;
    
    if (n == Integer.MIN_VALUE) {
      n++;
      result = base;
    }
    
    if (isNegative) n = -n;
    
    while (n > 0)
    {
      if (n%2 == 1) result *= base;
      base *= base;
      n >>= 1;
    }

    return result;
  }
}
