package com.example.leetcode._351_to_400._387_FirstUniqueCharacterIn_a_String;

public class Main387
{
  public static void main(String[] args)
  {
    System.out.println("350. Intersection of Two Arrays II");
    
    String format = "\r\ns = %s"
                  + "\r\nReturn: %d"
                  ;
    
    Solution387 sol = new Solution387v3();
    
    for (String s : _testCases)
    {
      int res = sol.firstUniqChar(s);
      System.out.println(String.format(format, s, res));
    }
  }

  private static String[] _testCases = 
  {
      "leetcode"          // Excepted: 0
    , "loveleetcode"      // Excepted: 2    
    , "cc"                // Excepted: -1
  };
}
