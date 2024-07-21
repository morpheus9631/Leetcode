package com.example.leetcode._301_to_350._345_ReverseVowelsOf_a_String;

public class Main345
{
  public static void main(String[] args)
  {
    System.out.println("345. Reverse Vowels of a String");
    
    String format = "\r\ns = \"%s\""
                  + "\r\nReturn: \"%s\""
                  ;
    
    Solution345 sol = new Solution345v2();
    
    for (String s : _testCases)
    {
      String str = sol.reverseVowels(s);
      System.out.println(String.format(format, s, str));
    }
  }

  private static String[] _testCases = 
  {
      "hello"               // Expected: "holle"
    , "leetcode"            // Expected: "leotcede"
    , "ai"                  // Expected: "ia"
    , "aA"                  // Expected: "Aa"
    , "Live on evasions? No I save no evil."    // Expected: "Live on evasIons? No i save no evil."
  };
  
}
