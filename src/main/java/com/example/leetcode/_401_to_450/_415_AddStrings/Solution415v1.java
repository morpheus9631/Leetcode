package com.example.leetcode._401_to_450._415_AddStrings;

/*
 * Your runtime beats 40.66 % of java submissions. 
 */

public class Solution415v1 implements Solution415
{
  public String addStrings(String num1, String num2) 
  {
    StringBuilder sb = new StringBuilder();
    
    int i = num1.length() - 1;
    int j = num2.length() - 1;
    int sum = 0, carry = 0;
    
    while (i >= 0 && j >= 0)
    {
      char ch1 = num1.charAt(i);
      char ch2 = num2.charAt(j);
      sum = carry + (ch1-'0') + (ch2-'0');
      
      carry = sum / 10;
      sum = sum % 10;

      sb.insert(0, sum);
      i--; j--;
    }

    while (i >= 0) 
    {
      sum = carry + (num1.charAt(i) - '0');
      carry = sum / 10;
      sum= sum % 10;
      sb.insert(0, "" + sum);
      i--;
    }

    while (j >= 0) 
    {
      sum = carry + (num2.charAt(j) - '0');
      carry = sum / 10;
      sum = sum % 10;
      sb.insert(0, "" + sum);
      j--;
    }
    
    System.out.println(carry+", "+sum);
    if (carry > 0) sb.insert(0, carry+"");
    
    return sb.toString();
  }
}
