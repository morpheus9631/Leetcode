package com.example.leetcode._001_to_050._044_WildcardMatching;

public class Main044
{
  public static void main(String[] args)
  {
    System.out.println("44.Wildcard Matching");
    System.out.println("\r\n");
    
    Solution044 sol = new Solution044v1();

    for (String[] testcase : _testCases)
    {
      String s = testcase[0];
      String p = testcase[1];
      boolean isMatch = sol.isMatch(s, p);
      
      System.out.println(String.format(_format, s, p, isMatch));
    }
  }

  private static String[][] _testCases = 
  {
    { "aa",  "a"     }, 
    { "aa",  "aa"    }, 
    { "aaa", "aa"    },
    { "aa",  "*"     },
    { "aa",  "a*"    },
    { "ab",  "?*"    },
    { "aab", "c*a*b" },
    { "",    "*"     },
    { "ab",  "*a"    },
    { "a",   "aa"    },
    { "abefcdgiescdfimde", "ab*cd?i*de" },
    { "hi",  "*?"    } 
  };

  private static String _format = 
      "isMatch(\"%s\", \"%s\") -> %b";
    ;
}
