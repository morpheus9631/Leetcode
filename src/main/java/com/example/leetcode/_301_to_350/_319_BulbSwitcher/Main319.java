package com.example.leetcode._301_to_350._319_BulbSwitcher;

public class Main319
{
  public static void main(String[] args)
  {
    System.out.println("319. Bulb Switcher");
    
    String format = "\r\nn = %d"
                  + "\r\nReturn: %d";
    
    Solution319 sol = new Solution319v1();
    for (int n : _testCases)
    {
      int k = sol.bulbSwitch(n);
      System.out.println(String.format(format, n, k));
    }
  }
  
  private static int[] _testCases = 
  {
    3   
  };
}
