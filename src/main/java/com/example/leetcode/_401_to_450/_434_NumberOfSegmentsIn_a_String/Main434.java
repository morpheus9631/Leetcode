package com.example.leetcode._401_to_450._434_NumberOfSegmentsIn_a_String;

public class Main434
{
  public static void main(String[] args)
  {
    System.out.println("434. Number of Segments in a String");
    
    String format = "\r\nInput: \"%s\""
                  + "\r\nOutput: %d"
                  ;
    
    Solution434 sol = new Solution434v4();
    for (String s : _testCases)
    {
      int res = sol.countSegments(s);
      System.out.println(String.format(format, s, res));
    }
  }

  private static String[] _testCases = 
  {
       "Hello, my name is John"         // Expected: 5
     , ""                               // Expected: 0
     , ", , , ,        a, eaefa"        // Expected: 6
     , "                "               // Expected: 0
     , "a, bb, cc, cc#, "               // Expected: 4
     , "   foo   bar"                   // Expected: 2
  };
}
