package com.example.leetcode._351_to_400._389_FindTheDifference;

/*
 * Your runtime beats 42.56% of java submissions.
 */

public class Solution389v4 implements Solution389 
{
  public char findTheDifference(String s, String t)
  {
    int size = 26;
    int[] array = new int[size];
   
    int i = 0;
    while (i < s.length() && i < t.length())
    {
      array[s.charAt(i)-'a'] += 1; 
      array[t.charAt(i)-'a'] -= 1;
      i++;
    }
    
    int j = i;
    while (i < s.length()) array[s.charAt(i++)-'a'] += 1;
    while (j < t.length()) array[t.charAt(j++)-'a'] -= 1;
    
    for (int k=0; k<size; k++)
      if (array[k] != 0) return (char) ('a'+k);
    
    return '\0';
  }
}
