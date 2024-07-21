package com.example.leetcode._101_to_150._115_DistinctSubsequences;

public class Main115
{
  public static void main(String[] args)
  {
    System.out.println("115. Distinct Subsequences");
    
    String format = "\r\nS = %s"
                  + "\r\nT = %s"
                  + "\r\n\r\nReturn: %d";
    
    Solution115 sol = new Solution115v1();
    
    for (String[] testcase : _testCases)
    {
      String s = testcase[0];
      String t = testcase[1];
      int res = sol.numDistinct(s, t);
      
      System.out.println(String.format(format, s, t, res));
    }
  }
  
  private static String[][] _testCases = 
  {
    { "rabbbit", "rabbit" } 
  };
}
