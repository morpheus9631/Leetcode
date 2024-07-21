package com.example.leetcode._401_to_450._434_NumberOfSegmentsIn_a_String;

/*
 * Your runtime beats 81.73 % of java submissions.
 */
public class Solution434v1 implements Solution434 
{
  public int countSegments(String s) 
  {
    if (s == null || s.length() == 0) return 0;

    int i = 0, segs = 0;
    while (i < s.length())
    {
      while (i < s.length() && s.charAt(i) == ' ') i++;
      while (i < s.length() && s.charAt(i) != ' ') i++;
      if (i < s.length() || (i == s.length() && s.charAt(i-1) != ' ')) 
        segs++;
    }
    return segs;
  }
}
