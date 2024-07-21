package com.example.leetcode._201_to_250._205_IsomorphicStrings;

import java.util.HashMap;

/*
 * Your runtime beats 55.45% of java submissions.
 */

public class Solution205v1 implements Solution205
{
  public boolean isIsomorphic(String s, String t)
  {
    if (s.length() != t.length()) return false;
    
    HashMap<Character, Character> map = new HashMap<Character, Character>();
    for (int i=0; i<s.length(); i++)
    {
      Character ch1 = s.charAt(i);
      Character ch2 = t.charAt(i);

      if(map.containsKey(ch1))
      {
        if (!ch2.equals(map.get(ch1))) 
          return false;
      }
      else
      {
        if (map.containsValue(ch2)) return false; 
        map.put(ch1, ch2);
      }
    }
    
    return true;
  }
}
