package com.example.leetcode._001_to_050._050_Pow;

public class Main050
{

  public static void main(String[] args)
  {
    System.out.println("50. Pow(x, n)");
    
    String format = "\r\nPow(%f, %d) = %f";
    
    Solution050 sol = new Solution050v2();
    
    for (double[] test_case : _testCases)
    {
      double x = test_case[0];
      int n = (int) test_case[1];
      double res = sol.myPow(x, n);
      
      System.out.println(String.format(format, x, n, res));
    }
  }
  
  private static double[][] _testCases =
  {
    { 2.0, 10.0 },                // Expected: 1024
    { 34.00515, -3.0 },           // Expected: 0.00003
    { 0.00001, 2147483647.0 },
    { 1.00000, -2147483648.0 },
    { 3.89707, 2.0 },
    { 2.00000, -2147483648.0 },
    { -1.00000, -2147483648.0 }
  };
}
