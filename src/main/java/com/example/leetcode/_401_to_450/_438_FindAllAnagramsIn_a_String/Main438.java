package com.example.leetcode._401_to_450._438_FindAllAnagramsIn_a_String;

import java.util.List;

public class Main438
{
  public static void main(String[] args)
  {
    System.out.println("438. Find All Anagrams in a String");

    String format = "\r\ns: %s"
                  + "\r\np: %s"
                  + "\r\nOutput: %s"
                  ;
    
    Solution438 sol = new Solution438v3();
    for (String[] testcase : _testCases)
    {
      String s = testcase[0];
      String p = testcase[1];
      List<Integer> list = sol.findAnagrams(s, p);
      System.out.println(String.format(format, p, s, list.toString()));
    }
  }  
  
  private static String[][] _testCases = 
  {
      {"cbaebabacd", "abc"}
    , {"abab", "ab"}
    , {"aa", "bb"}
    , {"af","be"}
  };
}
