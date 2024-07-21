package com.example.leetcode._051_to_100._058_LengthOfLastWord;


public class Solution058v1 implements Solution058
{
  public int lengthOfLastWord(String s) 
  {
    if (s ==null || s.length() == 0) return 0;

    String[] split = s.split(" ");
    int len = split.length; 
    return (len == 0) ? 0 : split[len-1].length();
  }
}
