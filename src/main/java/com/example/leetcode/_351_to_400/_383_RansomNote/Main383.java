package com.example.leetcode._351_to_400._383_RansomNote;


public class Main383
{
  public static void main(String[] args)
  {
    System.out.println("383. Ransom Note");
    
    String format = "\r\ncanConstruct(\"%s\", \"%s\") -> %b";
    
    Solution383 sol = new Solution383v1();
    
    for (String[] testcase : _testCases)
    {
      String str1 = testcase[0];
      String str2 = testcase[1];
      boolean res = sol.canConstruct(str1, str2);
      System.out.println(String.format(format, str1, str2, res));
    }
  }
  
  private static String[][] _testCases = 
  {
      {"a", "b"}
    , {"aa", "ab" }
    , {"aa", "aab" }
    , {"fffbfg", "effjfggbffjdgbjjhhdegh" }    
  };
}
