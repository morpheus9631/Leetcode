package com.example.leetcode._301_to_350._326_PowerOfThree;

public class Solution326v2 implements Solution326
{
  public boolean isPowerOfThree(int n) 
  {
    double logN = Math.log10(n) / Math.log10(3);
    return (logN -(int)logN == 0);
  }
}
