package com.example.leetcode._351_to_400._387_FirstUniqueCharacterIn_a_String;

/*
 * Your runtime beats 95.99% of java submissions.
 */

public class Solution387v3 implements Solution387 
{
  public int firstUniqChar(String s) 
  {
    if (s == null || s.length() == 0) return -1;
    
    int[] letters = new int[26];
    for (int i=0; i<letters.length; i++) letters[i] = -1;

    for (char ch : s.toCharArray()) {
      letters[ch-'a'] += 1;
    }
    
    int idx = Integer.MAX_VALUE;
    for (int i=0; i<letters.length; i++) 
    {
      if (letters[i] == 0 && s.indexOf('a'+i) < idx) 
        idx = s.indexOf('a'+i); 
    }
    if (idx == Integer.MAX_VALUE) idx = -1;
    return idx;
  }
}
