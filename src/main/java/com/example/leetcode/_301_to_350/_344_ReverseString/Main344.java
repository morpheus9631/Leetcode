package com.example.leetcode._301_to_350._344_ReverseString;


public class Main344
{
  public static void main(String[] args)
  {
    System.out.println("344. Reverse String");
    
    String format = "\r\nS = \"%s\" -> \"%s\"";
    
    Solution344 sol = new Solution344v3();
    
    for (String s : _testCases)
    {
      String str = sol.reverseString(s);
      System.out.println(String.format(format, s, str));
    }
  }
  
  private static String[] _testCases = 
  {
    "hello", "java"    
  };
}

