package com.example.leetcode._301_to_350._345_ReverseVowelsOf_a_String;

/*
 * Your runtime beats 19.68% of java submissions.
 */

public class Solution345v2 implements Solution345
{
  public String reverseVowels(String s) 
  {
    String vowels = "aeiouAEIOU";

    char[] array = s.toCharArray();
    
    int i = 0, j = s.length()-1;
    while (i < j)
    {
      while (i < s.length() && !vowels.contains(array[i]+""))
        i++;
      
      while (j >= 0 && !vowels.contains(array[j]+""))
        j--;
      
      System.out.println(i+", "+j+", "+array[i]+", "+array[j]); 
      
      if (i < j)
      {
        char tmp = array[i];
        array[i] = array[j];
        array[j] = tmp;
        i++; j--;
      }
    }
    return new String(array);
  }
}
