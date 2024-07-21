package com.example.leetcode._101_to_150._131_PalindromePartitioning;

import java.util.List;

import com.example.leetcode.utils.myListUtils;

public class Main131
{
  public static void main(String[] args)
  {
    System.out.println("131. Palindrome Partitioning");
    
    String format = "\r\nS = %s"
                  + "\r\n\r\nReturn:\r\n%s";
    
    Solution131 sol = new Solution131v1();
    
    for (String testcase :_testCases)
    {
      List<List<String>> res = sol.partition(testcase);
      
      System.out.println(
          String.format(format, testcase, myListUtils.toString(res)));
    }
  }
  
  private static String[] _testCases = 
  {
    "aab"   
  };
}
