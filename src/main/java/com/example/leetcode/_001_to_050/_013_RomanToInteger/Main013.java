package com.example.leetcode._001_to_050._013_RomanToInteger;

import com.example.leetcode.utils.myStringUtils;

public class Main013
{
  public static void main(String[] args)
  {
    System.out.println("13. Roman to integer");
    
    String format = "\r\nRoman: %s"
                  + "\r\nInteger: %d"
                  + "\r\n\r\n" + myStringUtils.dashLine(); 
                  ;
    
    Solution013 sol = new Solution013v1();
    
    String[] testcases = getTestCases();
    for (String roman : testcases)
    {
      int num = sol.romanToInt(roman);
      
      System.out.println(String.format(format, roman, num));
    }
  }
  
  private static String[] getTestCases()
  {
    String[] testcases = 
    {
      "I", "MMMCMXCIX", "X", "MCMLXXVI", "DCXXI"
    };
    return testcases;
  }
}
