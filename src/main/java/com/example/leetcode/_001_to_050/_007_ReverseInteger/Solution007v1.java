package com.example.leetcode._001_to_050._007_ReverseInteger;

public class Solution007v1 implements Solution007
{
  public int reverse(int x)
  {
    if (x < 10 && x > -10) return (int) x;
      
    StringBuilder sb = new StringBuilder(String.valueOf(x));
    
    int i = 0, j = sb.length()-1;
    if (x < 0) i++;
    
    while (i < j)
    {
      char ch = sb.charAt(i);
      sb.setCharAt(i, sb.charAt(j));
      sb.setCharAt(j, ch);
      i++; j--;
    }
    
    long val = Long.parseLong(sb.toString());
    if (val > Integer.MAX_VALUE || val < Integer.MIN_VALUE) return 0;
   
    return Integer.parseInt(sb.toString());
  }
}
