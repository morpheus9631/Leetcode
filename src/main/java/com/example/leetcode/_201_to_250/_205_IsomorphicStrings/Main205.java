package com.example.leetcode._201_to_250._205_IsomorphicStrings;

public class Main205
{
  public static void main(String[] args)
  {
    System.out.println("205. Isomorphic Strings");
    
    String format = "\r\ns = \"%s\""
                  + "\r\nt = \"%s\""
                  + "\r\nIsomorphic? %b";
    
    Solution205 sol = new Solution205v1();

    for (String[] testcase : _testCases)
    {
      String s = testcase[0];
      String t = testcase[1];
      
      boolean isSom = sol.isIsomorphic(s, t);
      System.out.println(String.format(format, s, t, isSom));
    }
  }
  
  private static String[][] _testCases = 
  {
      {"egg", "add"}
    , {"foo", "bar"}
    , {"paper", "title"}
    , {"ab", "aa"}
  };

}
