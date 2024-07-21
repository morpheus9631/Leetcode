package com.example.leetcode._301_to_350._344_ReverseString;

public class Solution344v1 implements Solution344
{
  public String reverseString(String s) 
  {
    StringBuffer sb = new StringBuffer();
    
    for (int i=s.length()-1; i>=0; i--)
      sb.append(s.charAt(i));
    
    return sb.toString();
  }
}
