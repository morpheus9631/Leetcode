package com.example.leetcode._151_to_200._191_NumberOf_1_Bits;

public class Solution191v1 implements Solution191
{
  // you need to treat n as an unsigned value
  public int hammingWeight(int n) 
  {
    int cnt = 0;

    long l = Integer.toUnsignedLong(n);
    while (l != 0) 
    {
      if ((l & 1) == 1) cnt++ ;
      l = l >> 1;
    }    
    return cnt;    
  }
}
