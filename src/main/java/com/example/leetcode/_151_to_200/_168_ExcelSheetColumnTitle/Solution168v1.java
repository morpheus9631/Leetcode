package com.example.leetcode._151_to_200._168_ExcelSheetColumnTitle;

public class Solution168v1 implements Solution168
{
  public String convertToTitle(int n) 
  {
    String str = "";
    while (n-- > 0)
    {
      int val = n % 26;
      str = (char)('A' + val) + str;
      n /= 26;
    }
    return str;
  }
}
