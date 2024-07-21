package com.example.leetcode._001_to_050.p003_LongestSubstr;

import java.util.HashMap;
import java.util.Map;

public class Solution01 implements Solution
{
  public int lengthOfLongestSubstring(String s) 
  {
    int maxLen = 0;
    int startIdx = 0;
    
    Map<Character, Integer> idxMap = new HashMap<Character, Integer>();
    
    int len = s.length();
    for(int i=0; i<len; i++)
    {
      char ch = s.charAt(i);
      
      if (idxMap.containsKey(ch) && startIdx <= idxMap.get(ch))
      {
        maxLen = Math.max(maxLen, i-startIdx);
        startIdx = idxMap.get(ch) + 1;
      }
      idxMap.put(ch, i);
    }
    return Math.max(maxLen, len-startIdx);
  }  
}
