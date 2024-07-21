package com.example.leetcode._251_to_300._263_UglyNumber;

public class Solution263v1 implements Solution263
{
  public boolean isUgly(int num) 
  {
    if (num <= 0) return false;
    
    int[] factors = { 2, 3, 5 };
    
    int i = 0;
    while (i < factors.length)
    {
      while (num % factors[i] == 0) {
        num /= factors[i];
      }
      i++;
    }
    return (num == 1) ? true : false;
  }
}
