package com.example.leetcode._351_to_400._389_FindTheDifference;

/*
 * Your runtime beats 42.56% of java submissions.
 */

public class Solution389v5 implements Solution389 
{
  public char findTheDifference(String s, String t)
  {
    int ans = 0;
    
    int i = 0;
    while (i < s.length() && i < t.length())
    {
      ans += s.charAt(i);
      ans -= t.charAt(i);
      i++;
    }
    
    int j = i;
    while (i < s.length()) ans += s.charAt(i++);
    while (j < t.length()) ans -= t.charAt(j++);
    
    return (char) (Math.abs(ans));
  }
}
