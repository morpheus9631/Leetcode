package com.example.leetcode._351_to_400._383_RansomNote;

public class Solution383v1 implements Solution383
{
  public boolean canConstruct(String ransomNote, String magazine) 
  {
    int[][] numCh = new int[2][26];
    
    for (char ch: magazine.toCharArray())
      numCh[0][ch-'a']++;
    
    for (char ch: ransomNote.toCharArray())
      numCh[1][ch-'a']++;

    for (int i=0; i<26; i++)
    {
      if (numCh[1][i] > numCh[0][i]) 
        return false;
    }
      
    return true;
  }
}
