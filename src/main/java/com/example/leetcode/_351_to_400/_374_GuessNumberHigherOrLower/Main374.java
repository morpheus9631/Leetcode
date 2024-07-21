package com.example.leetcode._351_to_400._374_GuessNumberHigherOrLower;

public class Main374
{
  public static void main(String[] args)
  {
    System.out.println("374. Guess Number Higher or Lower");
    
    String format = "\r\nn = %d, I pick %d"
                   + "\r\nReturn %d";
                   ;

    Solution374 sol = new Solution374v1();
                   
    for (int[] testcase : _testCases)
    {
      int n = testcase[0];
      int ans = testcase[1];
      
      sol.setAnswer(ans);
      int res = sol.guessNumber(n);
      
      System.out.println(String.format(format, n, ans, res));
    }
  }
  
  private static int[][] _testCases = 
  {
     {10, 6}
  };
}
