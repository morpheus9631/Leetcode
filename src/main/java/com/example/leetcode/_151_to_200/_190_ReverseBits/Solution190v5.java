package com.example.leetcode._151_to_200._190_ReverseBits;


public class Solution190v5 implements Solution190
{
  // you need treat n as an unsigned value
  public int reverseBits(int n) 
  {  
    int INT_SIZE = Integer.SIZE;  

    int res = 0;
    int l_mask = 0x80000000;
    int r_mask = 0x00000001;
    
    for (int i=0; i<INT_SIZE/2; i++)
    { 
      int offset = INT_SIZE - i*2 - 1;
      int tmp1 = (n & (l_mask >>> i)) >>> offset;
      int tmp2 = (n & (r_mask << i)) << offset;
      res |= (tmp1 ^ tmp2);
    }  
    return res;   
  }  
}
