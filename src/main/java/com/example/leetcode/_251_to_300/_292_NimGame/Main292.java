package com.example.leetcode._251_to_300._292_NimGame;

public class Main292
{
  public static void main(String[] args)
  {
    System.out.println("292. Nim Game");
    
    String format = "\r\nNumber of stones = %d"
                  + "\r\nReturn: %b"
                  ;
    
    Solution292 sol = new Solution292v1();
    
    for (int n :_testCases)
    {
      boolean isWin = sol.canWinNim(n);
      
      System.out.println(String.format(format, n, isWin));
    }
    

  }

  private static int[] _testCases = 
  {
    1, 2, 3, 4, 5
  };
}
