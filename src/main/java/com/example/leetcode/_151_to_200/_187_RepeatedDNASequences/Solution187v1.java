package com.example.leetcode._151_to_200._187_RepeatedDNASequences;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Solution187v1 implements Solution187
{
  public List<String> findRepeatedDnaSequences(String s) 
  {
    List<String> results = new ArrayList<String>();
    
    if (s == null || s.length() < 9) return results; 

    Map<Character, Integer> elemMap = new HashMap<Character, Integer>();
    elemMap.put('A', 0);
    elemMap.put('C', 1);    
    elemMap.put('G', 2);    
    elemMap.put('T', 3);    
    
    Map<Integer, Integer> patternMap = new HashMap<Integer, Integer>();

    int pattern = 0;
    for (int i=0; i<s.length(); i++)
    {
      char ch = s.charAt(i);
      pattern = ((pattern << 2) + elemMap.get(ch)) & 0x000FFFFF;
      if (i < 9) continue;
      
      if (!patternMap.containsKey(pattern)) {
        patternMap.put(pattern, 0);
      }
      int val = patternMap.get(pattern) + 1;
      patternMap.put(pattern, val);
      
      if (val > 1)
      {
        String str = s.substring(i-9, i+1);
        if (!results.contains(str)) results.add(str);
      }
    }

    return results;
  }
}
