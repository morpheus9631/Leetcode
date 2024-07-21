package com.example.leetcode._101_to_150._131_PalindromePartitioning;

import java.util.ArrayList;
import java.util.List;

/*
 * 這題看別人的解答的，有空再自己想詳看有無其他解法。
 */

public class Solution131v1 implements Solution131
{
  public List<List<String>> partition(String s) 
  {
    List<List<String>> res = new ArrayList<List<String>>();
    dfs(s, res, new ArrayList<String>(), 0);
    return res;
  }

  private void dfs(String s, List<List<String>> res, List<String> temp, int i) 
  {
    if (i == s.length()) {
      res.add(new ArrayList<>(temp));
      return;
    }
   
    for(int j=i; j<s.length(); j++) 
    {
      // 如果 [i,j] 中字符不構成回文，那麼不進行下一次遞迴，直接進入下一次循環判斷[i,j+1]
      if (isPalindrome(s, i, j)) 
      {  
        temp.add(s.substring(i, j+1));
        
        // 如果[i,j]中字符構成回文，那麼進行下一次遞迴，判斷 j+1 之後字符是否構成回文
        dfs(s, res, temp, j+1);   
        temp.remove(temp.size()-1);
      }
    }
  }
  
  private boolean isPalindrome(String s, int left, int right) 
  {  
    while (left < right) {  
      if (s.charAt(left++) != s.charAt(right--)) return false;  
    }  
    return true;  
  }    
}
