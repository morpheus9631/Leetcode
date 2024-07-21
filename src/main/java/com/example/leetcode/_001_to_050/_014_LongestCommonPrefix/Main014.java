package com.example.leetcode._001_to_050._014_LongestCommonPrefix;

import java.util.Arrays;

public class Main014
{
  public static void main(String[] args)
  {
    System.out.println("1. Two Sum");

    String format = "\r\nS = %s"
                  + "\r\nReturn: \"%s\""
                  ;
    
    Solution014 sol = new Solution014v1();
    
    for (String[] strs : _testCases)
    {
      String str = sol.longestCommonPrefix(strs);
      
      System.out.println(
          String.format(format, Arrays.toString(strs), str));
    }
  }
  
  private static String[][] _testCases = 
  {
      {}
    , {"abcd","abccc","abdec"}  // Expected: "ab"
    , {"a"}                     // Expected: "a"
  };

}
