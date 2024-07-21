package com.example.leetcode._401_to_450._438_FindAllAnagramsIn_a_String;

import java.util.LinkedList;
import java.util.List;

/*
 * Your runtime beats 14.11 % of java submissions.
 */

public class Solution438v1 implements Solution438 
{
  public List<Integer> findAnagrams(String s, String p)
  {
    List<Integer> list = new LinkedList<Integer>();
    
    int len1 = s.length();
    int len2 = p.length();
    if (len1 < len2) return list;
    
    int sum2 = 0;
    int[] nums2 = new int[26];
    for (char ch : p.toCharArray()) 
    {
      sum2 += ch;
      nums2[ch-'a']++;
    }
    
    for (int i=0; i<=len1-len2; i++)
    {
      int sum1 = 0;
      int[] nums1 = new int[26];
      for (int j=0; j<len2; j++) 
      {
        char ch1 = s.charAt(i+j);
        nums1[ch1-'a']++;
        sum1 += ch1;
      }
      if (sum1 == sum2)
      {
        boolean isFind = true;
        for (int j=0; j<26; j++)
        {
          if (nums1[j] != nums2[j]) 
          {
            isFind = false;
            break;
          }
        }
        if (isFind) list.add(i);
      }
    }
    return list;
  }
}
