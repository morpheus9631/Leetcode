package com.example.leetcode._401_to_450._438_FindAllAnagramsIn_a_String;

import java.util.ArrayList;
import java.util.List;

/*
 * Your runtime beats 32.19 % of java submissions.
 */

public class Solution438v2 implements Solution438 
{
  public List<Integer> findAnagrams(String s, String p)
  {
    List<Integer> list = new ArrayList<>();

    if (s == null || s.length() == 0 || 
        p == null || p.length() == 0) return list;
    
    int[] hash = new int[256];
    for (char c : p.toCharArray()) hash[c]++;
    
    for (int i=0; i<16; i++) {
      for (int j=0; j<16; j++) {
        System.out.print(hash[i*16+j]+", ");
      }
      System.out.println();
    }
    
    int left = 0, right = 0, count = p.length();
    while (right < s.length()) 
    {
        if (hash[s.charAt(right++)]-- >= 1) count--; 

        if (count == 0) list.add(left);

        if (right - left == p.length() && hash[s.charAt(left++)]++ >= 0) count++;
    }
    return list;  
  }
}
