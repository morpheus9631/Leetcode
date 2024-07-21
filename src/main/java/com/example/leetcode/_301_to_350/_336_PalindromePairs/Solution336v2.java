package com.example.leetcode._301_to_350._336_PalindromePairs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Hashtable;
import java.util.List;

/*
 * Eclipse 的答案是對的，但是在 leetcode 上的答案是錯的 ---> ??? 
 * 
 */

public class Solution336v2 implements Solution336
{
  public List<List<Integer>> palindromePairs(String[] words) 
  {
    List<List<Integer>> res = new ArrayList<List<Integer>>();

    if (words == null || words.length == 0) return res; 
    
    Hashtable<String, Integer> table = new Hashtable<String, Integer>();
    for (int i=0; i<words.length; i++) table.put(words[i], i);
    System.out.println("Table: " + table.toString()+"\r\n");

    // 如果 words 中存在 "", 那麼 words 中原來本身就是 palindrome 的 word 可以先輸出
    boolean isHasEmptyStr = table.containsKey(""); 
    if (isHasEmptyStr)
    {
      int i = table.get("");
      table.remove("");
      
      for (String s : table.keySet())
      {
        int j = table.get(s);
        if (isPalindrome(s)) 
        {
          res.add(new ArrayList<Integer>(Arrays.asList(i, j)));
          res.add(new ArrayList<Integer>(Arrays.asList(j, i)));
        }  
      }
    }
    if (table.keySet().isEmpty()) return res;
    
    /*
     *  處理字串長度為 1 的 word: 
     *  1. 長度為 1 的字串, 反向字串完全相同, 先處理才能有效減少後續需處理的 word 數量
     *  2. 長度為 1 的字串和其它長度為 1 的字串組合時, 必不是 palindrome
     */
    List<String> charList = new ArrayList<String>();
    List<String> wordList = new ArrayList<String>(table.keySet());
    for (int i=0; i<wordList.size(); i++)
    {
      String s1 = wordList.get(i);
      if (s1.length() == 1) charList.add(s1);
      
      for (int j=i+1; j<wordList.size(); j++)
      {
        String s2 = wordList.get(j);
        if (s1.length() == 1 && s2.length() == 1) continue;
        if (s1.length() > 1 && s2.length() > 1) continue;

        boolean isP1 = isPalindrome(s1+s2);
        boolean isP2 = isPalindrome(s2+s1);

        int i1 = table.get(s1);
        int j1 = table.get(s2);
        if (isP1) res.add(new ArrayList<Integer>(Arrays.asList(i1, j1)));
        if (isP2) res.add(new ArrayList<Integer>(Arrays.asList(j1, i1)));
      }
    }
    table.keySet().removeAll(charList);
    if (table.keySet().isEmpty()) return res;
    
    // 將剩餘的字串分別放在彼此的前後，檢查是否為 Palindrome
    List<String> matchList = new ArrayList<String>();
    wordList = new ArrayList<String>(table.keySet());
    for (int i=0; i<wordList.size()-1; i++)
    {
      String s1 = wordList.get(i);
      for (int j=i+1; j<wordList.size(); j++)
      {
        String s2 = wordList.get(j);
        boolean isP1 = isPalindrome(s1+s2);
        boolean isP2 = isPalindrome(s2+s1);
        
        int i1 = table.get(s1);
        int j1 = table.get(s2);

        if (isP1) res.add(new ArrayList<Integer>(Arrays.asList(i1, j1)));
        if (isP2) res.add(new ArrayList<Integer>(Arrays.asList(j1, i1)));
        
        if (isP1 || isP2) 
        {
          matchList.add(s1);
          matchList.add(s2);
        }
      }
    }
    table.keySet().removeAll(matchList);
    return res;
  }

  private boolean isPalindrome(String s)
  {
    if (s == null || s.length() == 0) return true;
    
    int left = 0, right = s.length() - 1;
    while (left < right) {
      if (s.charAt(left++) != s.charAt(right--)) return false;
    }
    return true;
  }
}
