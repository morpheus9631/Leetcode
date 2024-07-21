package com.example.leetcode._401_to_450._415_AddStrings;

public class Main415
{
  public static void main(String[] args)
  {
    System.out.println("415. Add Strings");
    
    String format = "\r\nnum1 = %s"
                  + " \r\nnum2 = %s"
                  + "\r\nReturn: %s";

    Solution415 sol = new Solution415v3();
    for (String[] testcase : _testCases)
    {
      String num1 = testcase[0];
      String num2 = testcase[1];
      String res = sol.addStrings(num1, num2);
      
      System.out.println(String.format(format, num1, num2, res));
    }
    
  }

  private static String[][] _testCases = 
  {
      {"0", "0"}
    , {"1234567890", "9876543210"}   
    , {"98", "9"}
    , {"9", "99"}
  };
}
