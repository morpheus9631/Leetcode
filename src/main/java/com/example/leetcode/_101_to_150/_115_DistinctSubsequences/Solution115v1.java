package com.example.leetcode._101_to_150._115_DistinctSubsequences;

public class Solution115v1 implements Solution115
{
  public int numDistinct(String s, String t) 
  {
    int lenT = t.length();
    if (lenT == 0) return 1;
    
    int rows = s.length() + 1;
    int cols = t.length() + 1;
    
    int[][] match = new int[rows][cols];
    match[0][0] = 1;
    
    for (int i=1; i<rows; i++) 
    {
      match[i][0] = 1;
      for (int j=1; j<cols; j++) 
      {
        if (s.charAt(i-1) == t.charAt(j-1)) 
        {
          match[i][j] = match[i-1][j-1] + match[i-1][j];
        } else {
          match[i][j] = match[i-1][j];
        }
      }
    }
    return match[rows-1][cols-1];
  }
}
