package com.example.leetcode._201_to_250._242_ValidAnagram;

public class Main242
{
  public static void main(String[] args)
  {
    System.out.println("242. Valid Anagram");
    
    String format = "\r\ns = %s"
                  + "\r\nt = %s"
                  + "\r\nReturn: %b"
                  ;
    
    Solution242 sol = new Solution242v1();
    
    for (String[] testcase : _testCases)
    {
      String s = testcase[0];
      String t = testcase[1];
      boolean res = sol.isAnagram(s, t);
      
      System.out.println(String.format(format, s, t, res));
    }
  }
  
  private static String[][] _testCases = 
  {
      {"anagram", "nagaram" }
    , {"rat", "car"}
    , {"ab", "a" }              // Expected: false
    , {"aa", "a" }              // Expected: false
    , {"aacc", "ccac" }         // Expected: false
    , {"abcdefghijklmnopqrstuvwxyz", "qwertyuioplkjhgfdsazxcvbnm" } 
  };    
}
