package com.example.leetcode._201_to_250._231_PowerOfTwo;

public class Main231
{

  public static void main(String[] args)
  {
    System.out.println("206. Reverse Linked List");
    
    String format = "\r\nN = %s"
                  + "\r\nIs it a power of twos? %b";
    
    Solution231 sol = new Solution231v4();
    
    for (int n : _testCases)
    {
      boolean isPower2 = sol.isPowerOfTwo(n);
      
      System.out.println(String.format(format, n, isPower2));
    }

  }

  private static int[] _testCases = 
  {
    0, 1, 2, 4, 5
  };
}
