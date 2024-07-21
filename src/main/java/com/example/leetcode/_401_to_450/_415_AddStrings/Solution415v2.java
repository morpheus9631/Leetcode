package com.example.leetcode._401_to_450._415_AddStrings;

/*
 * Your runtime beats 37.20 % of java submissions. 
 */

public class Solution415v2 implements Solution415
{
  public String addStrings(String num1, String num2) 
  {
    StringBuilder sb = new StringBuilder();
    
    int i = num1.length() - 1;
    int j = num2.length() - 1;
    
    int sum = 0, carry = 0;
    while (i >= 0 || j >= 0)
    {
      int n1 = (i >= 0) ? (num1.charAt(i)-'0') : 0;
      int n2 = (j >= 0) ? (num2.charAt(j)-'0') : 0;
      sum = carry + n1 + n2;

      carry = sum / 10;
      sum %= 10;
      sb.insert(0, sum);
      i--; j--;
    }
    if (carry > 0) sb.insert(0, carry+"");

    return sb.toString();
  }
}
