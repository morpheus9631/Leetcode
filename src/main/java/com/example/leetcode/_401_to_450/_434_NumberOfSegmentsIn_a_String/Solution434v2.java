package com.example.leetcode._401_to_450._434_NumberOfSegmentsIn_a_String;

/*
 * Your runtime beats 81.64 % of java submissions.
 */
public class Solution434v2 implements Solution434 
{
  public int countSegments(String s) 
  {
    if (s == null) return 0;

    int segs = 0;
    for(int i=0; i<s.length(); i++)
    {
      if (s.charAt(i) != ' ' && (i == 0 || s.charAt(i-1) == ' '))
        segs++;
    }
    return segs;
  }
}
