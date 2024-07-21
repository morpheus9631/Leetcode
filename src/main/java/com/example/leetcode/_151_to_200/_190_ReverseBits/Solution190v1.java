package com.example.leetcode._151_to_200._190_ReverseBits;


public class Solution190v1 implements Solution190
{
  // you need treat n as an unsigned value
  public int reverseBits(int n) 
  {
    String inStr = Long.toBinaryString((long) n);
    
    if (inStr.length() >= 32) {
      int len = inStr.length();
      inStr = inStr.substring(len-32, len);
    } else
      while (inStr.length() < 32) inStr = "0" + inStr;
    
    StringBuffer sb = new StringBuffer();
    for (int i=0; i<16; i++)
    {
      sb.insert(i, inStr.charAt(32-i-1));
      sb.insert(i+1, inStr.charAt(i));
    }
    
    System.out.println(inStr);
    System.out.println(sb.toString());
    
    return Integer.parseUnsignedInt(sb.toString(), 2);
  }
}
