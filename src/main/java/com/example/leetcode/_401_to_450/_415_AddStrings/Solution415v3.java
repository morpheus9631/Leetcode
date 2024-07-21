package com.example.leetcode._401_to_450._415_AddStrings;

/*
 * Your runtime beats 53.24 % of java submissions. 
 */

public class Solution415v3 implements Solution415
{
  public String addStrings(String num1, String num2) 
  {
    StringBuilder sb = new StringBuilder();

    if (num1.length() < num2.length()) {
      String tmp = num1; num1 = num2; num2 = tmp;
    }

    int diff = num1.length() - num2.length();
    
    int carry = 0;
    int i = num2.length();
    while (--i >= 0)
    {
      carry += (num1.charAt(diff+i)-'0') + (num2.charAt(i)-'0'); 
      sb.insert(0, (carry % 10));
      carry /= 10;
    }
    
    i += diff;
    while (i >= 0)
    {
      carry += (num1.charAt(i--)-'0'); 
      sb.insert(0, (carry % 10));
      carry /= 10;
    }

    if (carry > 0) sb.insert(0, "1");

    return sb.toString();
  }
}
