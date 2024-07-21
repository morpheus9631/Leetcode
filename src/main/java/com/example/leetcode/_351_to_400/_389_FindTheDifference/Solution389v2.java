package com.example.leetcode._351_to_400._389_FindTheDifference;

/*
 * Your runtime beats 42.56% of java submissions.
 */

public class Solution389v2 implements Solution389 
{
  public char findTheDifference(String s, String t)
  {
    int size = 26;
    int[] array1 = new int[size];
    int[] array2 = new int[size];
   
    int i = 0, j = 0;
    while (i < s.length() && j < t.length())
    {
      array1[s.charAt(i++)-'a'] += 1; 
      array2[t.charAt(j++)-'a'] += 1; 
    }
    
    while (i < s.length()) array1[s.charAt(i++)-'a'] += 1;
    while (j < t.length()) array2[t.charAt(j++)-'a'] += 1;
    
    for (int k=0; k<size; k++)
      if (array1[k] != array2[k]) return (char) ('a'+k);
    
    return '\0';
  }
}
