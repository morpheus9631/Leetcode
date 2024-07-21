package com.example.leetcode._301_to_350._342_PowerOfFour;

public class Solution342v3 implements Solution342
{
  public boolean isPowerOfFour(int num) 
  {
    if(num == 0) return false;
    
    int mask = 0x03;
    while (num > 0)
    {
      if (num == 1) return true;
      
      if ((num & mask) != 0) return false;
      num >>= 2;
    }
    return false;
  }
}
