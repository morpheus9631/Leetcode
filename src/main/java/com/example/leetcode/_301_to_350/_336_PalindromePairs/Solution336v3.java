package com.example.leetcode._301_to_350._336_PalindromePairs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution336v3 implements Solution336
{
  public List<List<Integer>> palindromePairs(String[] words) 
  {
    List<List<Integer>> result = new ArrayList<List<Integer>>();
    
    for (int i = 0; i < words.length; i++) 
    {
      for (int j = 0; j < words.length; j++) 
      {
        if (i != j && isPalindrome(words[i], words[j])) 
          result.add(new ArrayList<Integer>(Arrays.asList(i, j)));
      }
    }
    return result;
  }
  
  public boolean isPalindrome(String word1, String word2) 
  {
    int i = 0;
    int j = word2.length() - 1;
    while (i < word1.length() && j >= 0) 
    {
      if (word1.charAt(i) != word2.charAt(j)) return false;
      i++;
      j--;
    }
    
    if (word1.length() < word2.length()) 
    {
      i = 0;
      while (i < j) 
      {
        if (word2.charAt(i) != word2.charAt(j)) return false;
        i++;
        j--;
      }
    } 
    else if (word1.length() > word2.length()) 
    {
      j = word1.length() - 1;
      while (i < j) 
      {
        if (word1.charAt(i) != word1.charAt(j)) return false;
        i++;
        j--;
      }
    }

    return true;
  }
}
