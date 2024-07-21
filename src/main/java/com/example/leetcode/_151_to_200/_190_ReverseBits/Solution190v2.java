package com.example.leetcode._151_to_200._190_ReverseBits;


public class Solution190v2 implements Solution190
{
  // you need treat n as an unsigned value
  public int reverseBits(int n) 
  {  
    int result = 0;  
    int i = 0;  
  
    while (i < 32) 
    {  
      int temp = n & 0x01;  
      n = n >> 1;  

      result = (result << 1) | temp;  
      i++;  
    }  
    return result;  
  }  
}
