package com.example.leetcode._151_to_200._191_NumberOf_1_Bits;

public class Solution191v2 implements Solution191
{
  // you need to treat n as an unsigned value
  public int hammingWeight(int n) 
  {
    int cnt = 0;
    
    while (n != 0) 
    {
      n = n & (n - 1); // clear the last 1 bit
      ++cnt;
    }    
    return cnt;    
  }
}
