package com.example.leetcode._401_to_450._405_Convert_a_NumberToHexadecimal;

/*
 * Your runtime beats 30.65% of java submissions.
 */

public class Solution405v3 implements Solution405
{
  public String toHex(int num) 
  {
    if (num == 0) return "0";

    StringBuilder sb = new StringBuilder();
    while (num != 0)
    {
      int val = num & 0x000F;
      char ch = (char) ((val < 10) ? ('0'+val) : ('a'+val-10)); 
      sb.insert(0,  ch);
      num >>>= 4;
    }
    return sb.toString();
  }
}
