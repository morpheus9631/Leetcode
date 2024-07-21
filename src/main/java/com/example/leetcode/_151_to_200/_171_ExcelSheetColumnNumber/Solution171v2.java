package com.example.leetcode._151_to_200._171_ExcelSheetColumnNumber;

public class Solution171v2 implements Solution171
{
  public int titleToNumber(String s) 
  {
    if (s == null || s.length() == 0) return 0;

    int sum = 0;
    for (int i=0; i<s.length(); i++) {  
      sum = 26 * sum + s.charAt(i) - 'A' + 1;  
    }  
    return sum;
  }
}
