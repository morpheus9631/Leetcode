package com.example.leetcode._101_to_150._125_ValidPalindrome;

public class Main125
{
  public static void main(String[] args)
  {
    System.out.println("125. Valid Palindrome");
    
    String format = "\r\nS: \"%s\""
                  + "\r\nIs valid palindrome? %b"
                  ;
    
    Solution125 sol = new Solution125v1();
    
    for (String s : _testCases)
    {
      boolean res = sol.isPalindrome(s);
      System.out.println(String.format(format, s, res));
    }
  }
  
  private static String[] _testCases = 
  {
      "A man, a plan, a canal: Panama"
    , "race a car"
    , ".,"
    , "a."
  };
}
