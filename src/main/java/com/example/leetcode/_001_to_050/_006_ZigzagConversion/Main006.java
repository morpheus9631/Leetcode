package com.example.leetcode._001_to_050._006_ZigzagConversion;

import com.example.leetcode.utils.myStringUtils;

public class Main006
{
  public static void main(String[] args)
  {
    System.out.println("6. ZigZag Conversion");

    String format = "\r\nConvert(%s, %d)"
                  + "\r\nReturn: %s"
                  + "\r\n\r\n" + myStringUtils.dashLine();
    
    Solution006 sol = new Solution006v1();

    String[][] test_cases = getTestCases();
    for (String[] testcase : test_cases)
    {
      String text = testcase[0];
      int nRows = Integer.parseInt(testcase[1]);
      String outStr = sol.convert(text, nRows);
      
      System.out.println(String.format(format, text, nRows, outStr));
    }
  }
  
  private static String[][] getTestCases()
  {
    String[][] testcase = { 
          { "PAYPALISHIRING", "3" }
        , { "AB",             "1" }
        , { "ABC",            "2" }
    };
    return testcase;
  }
}
