package com.example.leetcode._401_to_450._409_LongestPalindrome;

import java.util.HashMap;
import java.util.Map;

public class Solution409v1 implements Solution409
{
  public int longestPalindrome(String s) 
  {
    if (s == null || s.length() == 0) return 0;
    
    Map<Character, Integer> map = new HashMap<Character, Integer>();
    
    for (char key : s.toCharArray())
    {
      if (!map.containsKey(key)) map.put(key, 0);
      map.put(key, map.get(key)+1);
    }
    
    int oddCnt = 0;
    for (char key : map.keySet())
    {
      int val = map.get(key);
      if (val % 2 == 1) oddCnt++;
    }
    return s.length() - ((oddCnt == 0) ? 0 : oddCnt-1); 
  }
}
