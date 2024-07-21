package com.example.leetcode._401_to_450._412_FizzBuzz;

import java.util.List;

public class Main412
{
  public static void main(String[] args)
  {
    System.out.println("412. Fizz Buzz");
    
    String format = "\r\nInput = %d"
                  + "\r\n%s";
    
    Solution412 sol = new Solution412v1();
    
    for (int n : _testCases)
    {
      List<String> res = sol.fizzBuzz(n);
     
      String str = toMultiRowString(res);
      System.out.println(String.format(format, n, str));
    }
  }
  
  private static int[] _testCases = 
  {
    15
  };
  
  // ---------------------------------------------------------------------------
  public static String toMultiRowString(List<String> list)
  {
    StringBuilder sb = new StringBuilder();
    
    for (String str : list)
    {
      if (sb.length() > 0) sb.append(",");
      sb.append("\r\n  \""+str+"\"");
    }  
    sb.insert(0, "[").append("\r\n]");
    
    return sb.toString();
  }
  

}
