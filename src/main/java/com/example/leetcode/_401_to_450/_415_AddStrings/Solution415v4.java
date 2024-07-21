package com.example.leetcode._401_to_450._415_AddStrings;

/*
 * Your runtime beats 44.39 % of java submissions. 
 */

public class Solution415v4 implements Solution415
{
  public String addStrings(String num1, String num2) 
  {
    StringBuilder sb = new StringBuilder();
    
    int carry = 0;
    int i = num1.length() - 1;
    int j = num2.length() - 1;
    while (i >= 0 || j >= 0)
    {
      int n1 = 0, n2 = 0;
      if (i >= 0) n1 = num1.charAt(i--) - '0';
      if (j >= 0) n2 = num2.charAt(j--) - '0';
      
      carry += (n1 + n2);
      sb.insert(0, (carry % 10));
      carry /= 10;
    }
    if (carry > 0) sb.insert(0, carry);

    return sb.toString();
  }
}
