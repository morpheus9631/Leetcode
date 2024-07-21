package com.example.leetcode._251_to_300._258_AddDigits;

public class Main258
{
  public static void main(String[] args)
  {
    System.out.println("258. Add Digits");
    
    String format = "\r\nNum = %d"
                  + "\r\nReturn: %d"
                  ;
    
    Solution258 sol = new Solution258v2();
    
    for (int num : _testCases)
    {
      int res = sol.addDigits(num);
      System.out.println(String.format(format, num, res));
    }
    
  }
  
  private static int[] _testCases = 
  {
      38    // Expected: 2
    , 10    // Expected: 1
  };
}
