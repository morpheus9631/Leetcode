package com.example.leetcode._351_to_400._389_FindTheDifference;

import java.util.HashMap;
import java.util.Map;

/*
 * Your runtime beats 16.79% of java submissions.
 */

public class Solution389v1 implements Solution389 
{
  public char findTheDifference(String s, String t)
  {
    Map<Character, Integer> map = new HashMap<Character, Integer>();
   
    for (Character ch : s.toCharArray())
    {  
      Integer value = 1 + ((map.containsKey(ch)) ? map.get(ch) : 0);
      map.put(ch, value);
    }  
    System.out.println(map.toString());
    
    for (Character ch : t.toCharArray())
    {
      if (!map.containsKey(ch)) 
        return ch;
      else
      {
        Integer value = map.get(ch);
        if (value == 1) 
          map.remove(ch);
        else
          map.put(ch, value - 1);
      }
    }
    
    return '\0';
  }
}
