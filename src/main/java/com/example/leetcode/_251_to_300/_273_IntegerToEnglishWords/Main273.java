package com.example.leetcode._251_to_300._273_IntegerToEnglishWords;

public class Main273
{
  public static void main(String[] args)
  {
    System.out.println("273. Integer to English Words");
    
    String format = "\r\n%d -> %s";
                  ;
    Solution273 sol = new Solution273v1();
    
    for (int num : _testCases)
    {
      String numStr = sol.numberToWords(num);
      System.out.println(String.format(format, num, numStr));
    }
  }
  
  private static int[] _testCases = 
  {
    1234567, 123    
  };
}
