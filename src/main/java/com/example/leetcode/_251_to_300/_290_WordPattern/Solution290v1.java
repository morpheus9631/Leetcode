package com.example.leetcode._251_to_300._290_WordPattern;

import java.util.HashMap;
import java.util.Map;

/*
 * Your runtime beats 41.71% of java submissions.
 */

public class Solution290v1 implements Solution290
{
  public boolean wordPattern(String pattern, String str) 
  {
    String[] strs = str.split(" ");
    if (strs.length != pattern.length()) return false;

    Map<Character, String> map = new HashMap<Character, String>();
    
    for (int i=0; i<pattern.length(); i++)
    {
      char ch = pattern.charAt(i);
      if (!map.containsKey(ch))
      {
        if (map.containsValue(strs[i])) 
          return false;
        else
          map.put(ch, strs[i]);
      }  
      else
      {
        if (!map.get(ch).equals(strs[i])) return false;
      }
    }
    
    return true;
  }
}
