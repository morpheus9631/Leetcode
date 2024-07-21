package com.example.leetcode._301_to_350._345_ReverseVowelsOf_a_String;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/*
 * Your runtime beats 42.84% of java submissions.
 */

public class Solution345v1 implements Solution345
{
  public String reverseVowels(String s) 
  {
    List<Character> vowels = new LinkedList<Character>(
        Arrays.asList('a','e','i','o','u','A','E','I','O','U'));

    StringBuilder sb = new StringBuilder(s);
    
    char ch1 = '\0', ch2 = '\0';
    int i = 0, j = s.length()-1;
    while (i < j)
    {
      do {
        ch1 = sb.charAt(i++);
      } while (i < sb.length() && !vowels.contains(ch1)); 
      
      do {
       ch2 = sb.charAt(j--);
      } while (j >= 0 && !vowels.contains(ch2));
      
      System.out.println(i+", "+j+", "+ch1+", "+ch2); 
      
      if (i-1 < j+1)
      {
        sb.setCharAt(i-1, ch2);
        sb.setCharAt(j+1, ch1);
      }
    }
    return sb.toString();
  }
}
