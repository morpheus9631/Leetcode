package com.example.leetcode._351_to_400._367_ValidPerfectSquare;

public class Solution367v1 implements Solution367
{
  public boolean isPerfectSquare(int num) 
  {
    if (num == 1 || num == 4) return true;
    
    int mid = num / 2;
    for (int i=3; i<=mid; i++) {
      if (i*i == num) return true;
    }
    return false;
  }
}
