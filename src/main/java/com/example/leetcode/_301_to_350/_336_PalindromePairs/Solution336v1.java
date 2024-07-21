package com.example.leetcode._301_to_350._336_PalindromePairs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution336v1 implements Solution336
{
  public List<List<Integer>> palindromePairs(String[] words) 
  {
    List<List<Integer>> res = new ArrayList<List<Integer>>();
    
    if (words == null || words.length == 0) return res; 

    int len = words.length;
    for (int i=0; i<len-1; i++)
    {
      for (int j=i+1; j<len; j++)
      {
        String str1 = words[i] + words[j];
        String str2 = words[j] + words[i];
        
        if (isPalindrome(str1)) {
          res.add(new ArrayList<Integer>(Arrays.asList(i, j)));
        }

        if (isPalindrome(str2)) {
          res.add(new ArrayList<Integer>(Arrays.asList(j, i)));
        }
      }
    }
    
    return res;
  }
  
  private boolean isPalindrome(String s)
  {
    int left = 0, right = s.length() - 1;
    while (left < right) {
      if (s.charAt(left++) != s.charAt(right--)) return false;
    }
    return true;
  }
}
