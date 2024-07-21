package com.example.leetcode._001_to_050._020_ValidParentheses;

public class Main020
{
  public static void main(String[] args)
  {
    System.out.println("1. Two Sum");

    String format = "\r\ns = \"%s\" -> %b"
                  ;
    
    Solution020 sol = new Solution020v1();
    
    for (String str : _testCases)
    {
      boolean isValid = sol.isValid(str);
      
      System.out.println(String.format(format, str, isValid));
    }
  }
  
  private static String[] _testCases = 
  {
      "["
    , "()"        // Expected: true
    , "()[]{}"    // Expected: true
    , "(["
    , "([)]"
    , "]"
  };
}
