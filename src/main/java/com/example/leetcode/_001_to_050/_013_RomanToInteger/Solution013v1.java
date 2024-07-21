package com.example.leetcode._001_to_050._013_RomanToInteger;

import java.util.HashMap;

public class Solution013v1 implements Solution013
{
  public int romanToInt(String s) 
  {
    int sum = 0;
    
    HashMap<Character, Integer> romanMap = createRomanMap();
    
    char prevCh = '\0';
    for (char ch : s.toCharArray())
    {
      int curVal = romanMap.get(ch);
      
      if ((prevCh != '\0') &&
          ((prevCh == 'I') || (prevCh == 'X') || (prevCh == 'C')))
      {
        int preVal = romanMap.get(prevCh);
        
        if (preVal < curVal) sum -= preVal * 2;
      }
      sum += curVal;
      
      prevCh = ch;
    }
    
    return sum;
  }
  
  private HashMap<Character, Integer> createRomanMap() 
  {
    HashMap<Character, Integer> map = new HashMap<Character, Integer>();
    
    map.put('I', 1);
    map.put('V', 5);
    map.put('X', 10);
    map.put('L', 50);
    map.put('C', 100);
    map.put('D', 500);
    map.put('M', 1000);
    
    return map;
  }
}
