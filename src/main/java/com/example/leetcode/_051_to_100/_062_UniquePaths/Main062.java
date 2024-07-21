package com.example.leetcode._051_to_100._062_UniquePaths;

public class Main062
{
  public static void main(String[] args)
  {
    System.out.println("62. Unique Paths");
    
    String format = "\r\nm = %d, n = %d"
                  + "\r\nUnique paths are %d"
                  ;
  
    Solution062 sol = new Solution062v2();
    for (int[] test_case : _testCases)
    {
      int m = test_case[0];
      int n = test_case[1];
      int numPaths = sol.uniquePaths(m, n);
      
      System.out.println(String.format(format, m, n, numPaths));
    }
  }

  private static int[][] _testCases = 
  {
    {2,7}, {23,12}     
  };
}
