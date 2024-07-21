package com.example.leetcode._001_to_050._044_WildcardMatching;

public class Solution044v1 implements Solution044
{
  public boolean isMatch(String s, String p) 
  {
    if (s == null || p == null) return false;  
    if (p.length() == 0) return s.length() == 0;  
    
    int m = s.length();
    int n = p.length();
    
    int i = 0, j = 0, match = -1, start = -1;
    while (i < m)
    {
      if (j < n && (s.charAt(i) == p.charAt(j) || p.charAt(j) == '?')) 
      { 
        i++; j++; 
      }
      else if (j < n && p.charAt(j) == '*')
      {
        start = j++;
        match = i;
      }
      else
      {
        if (start == -1) return false;
        j = start;
        i = match + 1;
      }
    }
    
    while (j < n && p.charAt(j) == '*') j++;  
    return (j == n);
  }
}
