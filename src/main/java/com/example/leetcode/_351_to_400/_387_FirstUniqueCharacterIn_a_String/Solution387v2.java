package com.example.leetcode._351_to_400._387_FirstUniqueCharacterIn_a_String;

/*
 * Your runtime beats 34.30% of java submissions.
 */

public class Solution387v2 implements Solution387 
{
  public int firstUniqChar(String s) 
  {
    if (s == null || s.length() == 0) return -1;
    
    int idx = Integer.MAX_VALUE;
    for (Character ch : s.toCharArray())
    {
      if (s.indexOf(ch) != s.lastIndexOf(ch)) 
        continue;
      else
      {
        idx = s.indexOf(ch);
        break;
      }
    }
    if (idx == Integer.MAX_VALUE) idx = -1;
    
    return idx;
  }
}
