package com.example.leetcode._001_to_050._043_MultiplyStrings;

public class Solution043v3 implements Solution043
{
  public String multiply(String num1, String num2) 
  {
    if (num1 == null || num2 == null) return null;
    
    int len1 = num1.length();
    int len2 = num2.length();

    int len3 = len1 + len2;
    int[] num3 = new int[len3];

    for (int i=len2-1; i >= 0; i--) 
    {
      for (int j=len1-1; j >= 0; j--) 
      {
        int multiplicand = num1.charAt(j) - '0';
        int multiplier = num2.charAt(i) - '0';
        
        int product = multiplier * multiplicand + num3[i+j+1];
        num3[i+j+1] = product % 10;
        num3[i+j] += product / 10;
   
        int idx = i+j;
        while (num3[idx] >= 10)
        {
          int carry = num3[idx] / 10;
          num3[idx] = num3[idx] % 10;
          idx--;
          num3[idx] += carry;
        }
      }
    }

    StringBuilder sb = new StringBuilder();
    
    int i = 0;
    while (i < len3-1 && num3[i] == 0) i++;
    while (i < len3) sb.append(num3[i++]);

    return sb.toString();
  }
}
