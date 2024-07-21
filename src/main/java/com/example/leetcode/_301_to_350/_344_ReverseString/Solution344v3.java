package com.example.leetcode._301_to_350._344_ReverseString;

public class Solution344v3 implements Solution344
{
  public String reverseString(String s) 
  {
    if (s == null || s.length() == 0) return "";

    char[] ch = s.toCharArray();
    int len = s.length();
    
    for (int i=0; i<len/2; i++) 
    {
      char tmp = ch[i];
      ch[i] = ch[len-1-i];
      ch[len-1-i] = tmp;
    }
    return new String(ch);  
  }
}
