package com.example.leetcode._251_to_300._299_BullsAndCows;

/*
 */

public class Main299
{

  public static void main(String[] args)
  {
    System.out.println("299. Bulls and Cows");
    
    String format = "\r\nSecret: %s"
                  + "\r\nGuess : %s"
                  + "\r\nReturn: %s"
                  ;
        
    Solution299 sol = new Solution299v1();

    for (String[] testcase : _testCases)
    {
      String secret = testcase[0];
      String guess = testcase[1];
      String res = sol.getHint(secret, guess);
      
      System.out.println(String.format(format, secret, guess, res));
    }
  }
  
  private static String[][] _testCases = 
  {
      { "1807", "7810" }                // Excepted: 1A3B
    , { "1123", "0111" }                // Excepted: 1A1B
    , { "123456789", "123456789" }      // Excepted: 9A0B
    , { "11", "10" }                    // Excepted: 1A0B
    , { "1122", "0001" }                // Excepted: 0A1B
  };
}
