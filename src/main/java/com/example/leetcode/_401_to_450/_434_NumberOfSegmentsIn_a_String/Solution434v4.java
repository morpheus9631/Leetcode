package com.example.leetcode._401_to_450._434_NumberOfSegmentsIn_a_String;

/*
 * Your runtime beats 40.68 % of java submissions.
 * 
 * or 
 * 
 * Your runtime beats 81.64 % of java submissions.
 */
public class Solution434v4 implements Solution434 
{
  public int countSegments(String s) 
  {
    if (s == null || s.length() == 0) return 0;

    boolean isSeg = true;
    int i = 0, segs = 0;
    while (i < s.length())
    {
      if (s.charAt(i) == ' ') 
        isSeg = true;
      else
      {
        if (isSeg) 
        {
          segs++;
          isSeg = false;
        }
      }
      i++;
    }
    return segs;
  }
}
