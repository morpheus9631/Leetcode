package com.example.leetcode._251_to_300._263_UglyNumber;

public class Main263
{

  public static void main(String[] args)
  {
    System.out.println("263. Ugly Number");
    
    String format = "\r\n%d is an ugly numbe? %b";
    
    Solution263 sol = new Solution263v1();
    
    for (int num : _testCases)
    {
      boolean isUgly = sol.isUgly(num);
      
      System.out.println(String.format(format, num, isUgly));
    }
  }

  private static int[] _testCases = 
  {
    -2147483648, 14, 6, 8, 2, 3, 5
  };
}
