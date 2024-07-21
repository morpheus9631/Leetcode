package com.example.leetcode._301_to_350._326_PowerOfThree;

public class Solution326v1 implements Solution326
{
  public boolean isPowerOfThree(int n) 
  {
    while (n > 0 && n%3 == 0) n = n/3;
    return (n == 1);
  }
}
