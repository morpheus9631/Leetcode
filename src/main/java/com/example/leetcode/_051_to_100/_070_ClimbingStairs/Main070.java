package com.example.leetcode._051_to_100._070_ClimbingStairs;

public class Main070
{

  public static void main(String[] args)
  {
    System.out.println("70. Climbing Stairs");
    
    String format = "\r\nx = %d"
                  +"\r\nReturn: %d";
    
    Solution070 sol = new Solution070v6();
    
    for (int n : _testCases)
    {
      int ways = sol.climbStairs(n);
      System.out.println(String.format(format, n, ways) );
    }
  }
  
  private static int[] _testCases =
  {
    1, 3, 4, 5, 35, 38, 42
  };

}
