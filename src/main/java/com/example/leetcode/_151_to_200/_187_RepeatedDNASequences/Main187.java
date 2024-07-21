package com.example.leetcode._151_to_200._187_RepeatedDNASequences;

import java.util.List;

public class Main187
{
  public static void main(String[] args)
  {
    System.out.println("187. Repeated DNA Sequences");
    
    String format = "\r\nS = \"%s\""
                  + "\r\n\r\nReturn:\r\n %s";
    
    Solution187 sol = new Solution187v1();
    
    for (String str : _testCases)
    {
      List<String> list = sol.findRepeatedDnaSequences(str);
      System.out.println(String.format(format, str, list.toString()));
    }
  }
  
  private static String[] _testCases = 
  {
    "AAAAACCCCCAAAAACCCCCCAAAAAGGGTTT"
  };
}
