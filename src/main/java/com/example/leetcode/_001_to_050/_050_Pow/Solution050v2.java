package com.example.leetcode._001_to_050._050_Pow;

public class Solution050v2 implements Solution050
{
  public double myPow(double x, int n) 
  {
    if (n == 0) return 1;
    if (n == 1) return x;

    double result = 1.0;
    
    boolean isNegative = (n < 0);
    double base = (isNegative) ? 1.0/x : x; 

    if (n == Integer.MIN_VALUE) {
      n++;
      result *= base;
    }          
      
    if (isNegative) n = -n;
    int m = n / 2;
    double t = myPow(base, m);
    
    result = result * t * t;
    if (n%2 == 1) result *= base;

    return result;
  }
}
