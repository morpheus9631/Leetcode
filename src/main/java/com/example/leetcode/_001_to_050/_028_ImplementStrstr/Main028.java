package com.example.leetcode._001_to_050._028_ImplementStrstr;

public class Main028
{
  public static void main(String[] args)
  {
    System.out.println("28. Implement strStr()");
    
    String format = "\r\nhaystack = \"%s\""
                  + "\r\nneedle = \"%s\""
                  + "\r\nReturn: %d"
                  ;
    
    Solution028 sol = new Solution028v1();
    
    for (String[] testcase : _testCases)
    {
      String haystack = testcase[0];
      String needle = testcase[1];
      int res = sol.strStr(haystack, needle);
      
      System.out.println(
          String.format(format, haystack, needle, res));
    }
  }
  
  private static String[][] _testCases = 
  {
    {"", ""}  
  };
}
