package com.example.leetcode._201_to_250._242_ValidAnagram;

public class Solution242v1 implements Solution242
{
  public boolean isAnagram(String s, String t) 
  {
    if (s.length() != t.length()) return false;
    
    // ASCII code of from 'a' to 'z' is from 97 to 122;
    int[] cnt = new int[123]; 
    
    for (char ch : s.toCharArray()) {
      cnt[ch]++;
    }
    
    for (char ch : t.toCharArray()) 
    {
      cnt[ch]--;
      if (cnt[ch] < 0) return false;
    }

    return true;
  }
}
