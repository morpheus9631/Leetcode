package com.example.leetcode._151_to_200._171_ExcelSheetColumnNumber;

public class Solution171v1 implements Solution171
{
  public int titleToNumber(String s) 
  {
    if (s == null || s.length() == 0) return 0;

    int len = s.length();
    int sum = 0;
    for (int i=0; i<s.length(); i++)
    {
      int num = s.charAt(i) - 'A' + 1;

      sum += num * Math.pow(26.0, len-i-1);
      
      System.out.println(sum+", "+num+", "+(len-i-1));
    }
    
    return sum;
  }
}
