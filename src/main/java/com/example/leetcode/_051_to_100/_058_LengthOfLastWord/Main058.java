package com.example.leetcode._051_to_100._058_LengthOfLastWord;

public class Main058
{
  public static void main(String[] args)
  {
    System.out.println("58. Length of Last Word");
    
    String format = "\r\ns = \"%s\""
                  + "\r\nThe length is %d";
        
    Solution058 sol = new Solution058v2();
    
    for (String s : _testCases)
    {
      int len = sol.lengthOfLastWord(s);
      System.out.println(String.format(format, s, len));
    }
  }
  
  private static String[] _testCases = 
  {
    "Hello World", 
    "a ",               // Expected: 1
    "        "          // Expected: 0    
  };
}
