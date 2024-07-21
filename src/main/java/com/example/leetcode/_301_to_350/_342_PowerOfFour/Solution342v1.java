package com.example.leetcode._301_to_350._342_PowerOfFour;

public class Solution342v1 implements Solution342
{
  public boolean isPowerOfFour(int num) 
  {
    if(num == 0) return false;
    
    int pow = (int) (Math.log(num) / Math.log(4));
    
    return (num == Math.pow(4, pow));
  }
}
