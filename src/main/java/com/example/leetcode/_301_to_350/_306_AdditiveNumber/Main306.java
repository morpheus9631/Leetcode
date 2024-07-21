package com.example.leetcode._301_to_350._306_AdditiveNumber;

/*
 * 2016.09.29: 這題的題目有問題...
 */

public class Main306
{
  public static void main(String[] args)
  {
    System.out.println("306. Additive Number");
    
    System.out.println("\r\nIs it a additive Number?");
    
    String format = "\r\n\"%s\": %b";
    
    Solution306 sol = new Solution306v2();
    
    for (String num : _testCases)
    {
      boolean isAdditive = sol.isAdditiveNumber(num);
      System.out.println(String.format(format, num, isAdditive));
    }
  }
  
  private static String[] _testCases = 
  {
        "112358"        // true
      , "199100199"       // true
      , "0"           // false
      , "10"          // false
      , "1023"          // false
      , "101"         // true
      , "211738"        // true
      , "12122436"      // true
      , "12012122436"     //true 
      , "0235813"       // false
      , "011235"        // true
      , "120122436"       // false
      , "121202436"       // false
      , "198019823962"    // true
      , "1980198239625944"  // true
      , "101020305080130210"  // true
  };
}
