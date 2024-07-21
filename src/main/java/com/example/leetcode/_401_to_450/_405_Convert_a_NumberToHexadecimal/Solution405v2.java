package com.example.leetcode._401_to_450._405_Convert_a_NumberToHexadecimal;

/*
 * Your runtime beats 87.29% of java submissions.
 */

public class Solution405v2 implements Solution405
{
  public String toHex(int num) 
  {
    if (num == 0) return "0";
    
    char[] map = {'0','1','2','3','4','5','6','7','8','9','a','b','c','d','e','f'};
    
    String str = "";
    while (num != 0)
    {
      int idx = num & 0x000F;
      str = map[idx] + str;
      num >>>= 4;
    }
    return str;
  }
}
