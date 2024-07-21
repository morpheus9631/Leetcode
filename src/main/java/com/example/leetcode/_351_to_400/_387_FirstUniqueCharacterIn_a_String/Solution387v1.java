package com.example.leetcode._351_to_400._387_FirstUniqueCharacterIn_a_String;

import java.util.HashMap;
import java.util.Map;

/*
 * Your runtime beats 28.80% of java submissions.
 */

public class Solution387v1 implements Solution387 
{
  public int firstUniqChar(String s) 
  {
    if (s == null || s.length() == 0) return -1;
    
    Map<Character, Integer> map = new HashMap<Character, Integer>();
    for (Character key : s.toCharArray())
    {
      int value = 1 + (map.containsKey(key) ? 1 : 0);
      map.put(key, value);
    }
    
    int idx = Integer.MAX_VALUE;
    for (Character ch : map.keySet())
    {
      if (map.get(ch) > 1) continue;
      if (map.keySet().isEmpty()) break;
      if (s.indexOf(ch) < idx) idx = s.indexOf(ch);
    }
    if (idx == Integer.MAX_VALUE) idx = -1;
    
    return idx;
  }
}
