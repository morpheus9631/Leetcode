package com.example.leetcode._051_to_100._067_AddBinary;

public class Solution067v1  implements Solution067
{
  public String addBinary(String a, String b) 
  {
    if (a == null || b == null) return "0";
    
    if (a.length() == 0) return b;
    if (b.length() == 0) return a;
    
    StringBuffer sb = new StringBuffer();
    
    int carry = 0, sum = 0;
    
    int i = a.length() - 1;
    int j = b.length() - 1;
    while (i >= 0 && j >= 0)
    {
      sum = carry + a.charAt(i--)-'0' + b.charAt(j--)-'0';
      carry = sum / 2;
      sb.insert(0, Integer.toString(sum % 2));
    }

    while (i >= 0)
    {
      sum = carry + a.charAt(i--) - '0';
      carry = sum / 2;
      sb.insert(0, Integer.toString(sum%2));
    }

    while (j >= 0)
    {
      sum = carry + b.charAt(j--) - '0';
      carry = sum / 2;
      sb.insert(0, Integer.toString(sum%2));
    }
    
    if (carry > 0) sb.insert(0, Integer.toString(carry));
    
    return sb.toString();
  }
}
