package com.example.leetcode._251_to_300._290_WordPattern;

public class Main290
{
  public static void main(String[] args)
  {
    System.out.println("290. Word Pattern");
    
    String format = "\r\nPattern = \"%s\""
                  + "\r\nStr = \"%s\""
                  + "\r\nReturn: %b";
    
    Solution290 sol = new Solution290v1();
    
    for (String[] testcase : _testCases)
    {
      String pattern = testcase[0];
      String str = testcase[1];
      boolean isMatch = sol.wordPattern(pattern, str);
      
      System.out.println(String.format(format, pattern, str, isMatch));
    }

  }

  private static String[][] _testCases = 
  {
      {"abba", "dog cat cat dog"}       // Expected: true
    , {"abba", "dog cat cat fish"}      // Expected: false
    , {"aaaa", "dog cat cat dog"}       // Expected: false
    , {"abba", "dog dog dog dog"}       // Expected: false
  };
}
