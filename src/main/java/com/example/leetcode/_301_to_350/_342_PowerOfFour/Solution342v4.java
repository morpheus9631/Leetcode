package com.example.leetcode._301_to_350._342_PowerOfFour;

public class Solution342v4 implements Solution342
{
  public boolean isPowerOfFour(int num) 
  {
    if(num == 0) return false;

    // 4 的次方倍必定為 2 的次方倍, 2 的次方倍數判斷式如下： 
    if ((num & (num-1)) != 0) return false; 
    
    int pos = 0;
    for (int i=0; i<31; i++) 
    {
      if ((num & 0x01) == 1) break;
      num >>= 1;
      pos++;
    }

    return (pos % 2 == 0);
  }
}
