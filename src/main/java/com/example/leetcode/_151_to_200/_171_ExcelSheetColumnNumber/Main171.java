package com.example.leetcode._151_to_200._171_ExcelSheetColumnNumber;

public class Main171
{
  public static void main(String[] args)
  {
    System.out.println("171. Excel Sheet Column Number\r\n");
    
    String format = "%s -> %d";
    
    Solution171 sol = new Solution171v2();
    
    for (String str : _testCases)
    {
      int num = sol.titleToNumber(str);
      System.out.println(String.format(format, str, num));
    }
  }
  
  private static String[] _testCases = 
  {
    "A", "B", "C", "Z", "AA", "AB", "AZ"
  };
}
