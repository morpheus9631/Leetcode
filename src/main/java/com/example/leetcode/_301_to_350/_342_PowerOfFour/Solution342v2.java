package com.example.leetcode._301_to_350._342_PowerOfFour;

public class Solution342v2 implements Solution342
{
  public boolean isPowerOfFour(int num) 
  {
    if(num == 0) return false;
    
    while(num > 0)
    {
      if (num == 1) return true;
      
      if (num % 4 != 0) return false;
      num = num /4;
    }
    
    return false;
  }
}
