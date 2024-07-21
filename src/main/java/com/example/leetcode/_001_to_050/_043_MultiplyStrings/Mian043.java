package com.example.leetcode._001_to_050._043_MultiplyStrings;

import com.example.leetcode.utils.myStringUtils;

public class Mian043
{

  public static void main(String[] args)
  {
    System.out.println("43. Multiply Strings");
    
    Solution043 sol = new Solution043v3();
    for (String[] testcase : _testCases)
    {
      String num1 = testcase[0];
      String num2 = testcase[1];
      String num3 = sol.multiply(num1, num2);
      
      System.out.println(String.format(_format, num1, num2, num3));
    }
  }
  
  private static String[][] _testCases = 
  {
    {"0", "0"},
    {"1234", "5678"}
  };
  
  private static String _format = 
        "\r\nNum1 = %s"
      + "\r\nNum2 = %s"
      + "\r\n\r\nThe product is %s"
      + "\r\n\r\n" + myStringUtils.dashLine();
      ;

}
