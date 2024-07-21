package com.example.leetcode._201_to_250._233_NumberOfDigitOne;

public class Main233
{
  public static void main(String[] args)
  {
    System.out.println("233. Number of Digitsl One:");
    
    String format = "\r\nn = %d"
                  + "\r\nReturn: %d"
                  ;

    Solution233 sol = new Solution233v1();
    int n = 13;
    int k = sol.countDigitOne(n);
    System.out.println(String.format(format, n, k));
  }
}
