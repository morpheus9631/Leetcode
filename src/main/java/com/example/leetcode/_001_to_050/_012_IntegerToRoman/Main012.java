package com.example.leetcode._001_to_050._012_IntegerToRoman;

import com.example.leetcode.utils.myStringUtils;

public class Main012
{

  public static void main(String[] args)
  {
    System.out.println("12. Integer to Roman");

    String format = 
          "\r\nNum: %d" 
        + "\r\nRoman: %s"
        + "\r\n\r\n" + myStringUtils.dashLine();      
    
    Solution012 sol = new Solution012v2();

    int[] test_cases = getTestCases();
    for (int num : test_cases)
    {
       String romanStr = sol.intToRoman(num);
       
       System.out.println(String.format(format, num, romanStr));
    }
  }

  private static int[] getTestCases()
  {
    int[] testcases = { 1, 3999, 10, 1976 };
    return testcases;
  }
}
