package com.example.leetcode._001_to_050._007_ReverseInteger;

public class Main007
{
  public static void main(String[] args)
  {
    System.out.println("7. Reverse Integer");

    String format = "\r\nx = %d -> %d";
    
    Solution007 sol = new Solution007v2();
    
    for (int x : _testCases)
    {
      int rx = sol.reverse(x);
      
      System.out.println(String.format(format, x, rx)); 
    }
  }
  
  
  private static int[] _testCases = 
  {
    123, -123, 1534236469, -2147483648
  };

}
