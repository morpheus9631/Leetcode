package com.example.leetcode._401_to_450._434_NumberOfSegmentsIn_a_String;

/*
 * Your runtime beats 9.79 % of java submissions.
 */
public class Solution434v3 implements Solution434 
{
  public int countSegments(String s) 
  {
    if (s == null) return 0;
    
    s = s.trim();
    if (s.length() == 0) return 0;
    
    // '\s+' denotes one or more whitespace 
    return s.split("\\s+").length;  
  }
}
