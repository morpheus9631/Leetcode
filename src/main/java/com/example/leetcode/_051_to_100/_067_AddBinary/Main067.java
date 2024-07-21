package com.example.leetcode._051_to_100._067_AddBinary;

public class Main067
{
  public static void main(String[] args)
  {
    System.out.println("67. Add Binary\r\n");
    
    String format = "\r\na = %s"
                  + "\r\nb = %s"
                  + "\r\nSum is %s"
                  ;

    Solution067 sol = new Solution067v3();
    for (String[] testcase : _testCases)
    {
      String a = testcase[0];
      String b = testcase[1];
      String sum = sol.addBinary(a, b);
      
      System.out.println(String.format(format, a, b, sum));
    }
  }
 
  private static String[][] _testCases = 
  {
    { "11", "1" },
    { "0", "0" },
    { "1111", "1111" }        // Expected: "11110"
  }; 
}
