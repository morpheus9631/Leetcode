package com.example.leetcode._001_to_050._009_PalindromeNumber;

import com.example.leetcode.utils.myStringUtils;

public class Main009
{
  public static void main(String[] args)
  {
    System.out.println("9. Palindrome Number");
    
    String format = 
          "\r\nInteger: %d"
        + "\r\n\r\nIt is a palindrome number ? %b"
        + "\r\n" + myStringUtils.dashLine()
        ;

    Solution009 s = new Solution009v1();
    
    int[] test_cases = getTestCases();
    for (int x : test_cases)
    {
      boolean res = s.isPalindrome(x);
      
      System.out.println(String.format(format, x, res));
    }
  }

  private static int[] getTestCases()
  {
    int[] cases = 
    { 
      -2147483648,
      -2147447412,
      3,
      10,
      1000021,
      121,
      313,
      9999
    };
    return cases;
  }
  
}
