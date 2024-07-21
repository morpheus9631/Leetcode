package com.example.leetcode._151_to_200._168_ExcelSheetColumnTitle;


public class Main168
{
  public static void main(String[] args)
  {
    System.out.println("168. Excel Sheet Column Title\r\n");

    String format = "%d -> %s";
        
    Solution168 sol = new Solution168v1();
    
    for (int num : _testCases)
    {
      String str = sol.convertToTitle(num);
      System.out.println(String.format(format, num, str));
    }
  }
  
  private static int[] _testCases = 
  {
    1, 2, 3, 26, 27, 28, 52    
  };
}
