package com.example.leetcode._351_to_400._395_LongestSubstringWithAtLeast_K_RepeatingCharacters;

import java.util.ArrayList;
import java.util.List;

public class Solution395v1 implements Solution395
{
  public int longestSubstring(String s, int k) 
  {
    int max_len = 0;
    
    int len = s.length();
    if ((s == null) || (len == 0) || (len < k)) return 0; 

    char[] charArray = s.toCharArray();
    
    // 先把所有字母出現的次數儲存於陣列中
    int numLetters = 26; 
    int[] letter_repeats = new int[numLetters];
    for (char ch : charArray) {
    	letter_repeats[ch - 'a']++;
    }
    
    // 將字母次數少於 k 次的作為字串的斷點，並儲存於 list 中
    List<Integer> breakList = new ArrayList<Integer>();
    for (int i=0; i<charArray.length; i++) {
    	if (letter_repeats[charArray[i] - 'a'] < k) breakList.add(i);
    }
    if (breakList.isEmpty()) return s.length();
    
    breakList.add(0, -1);
    breakList.add(s.length());
    
    // 依斷點將輸入字串分成數小段
    List<String> substrList = new ArrayList<String>();
    for (int i=1; i<breakList.size(); i++)
    {
    	int begin = breakList.get(i-1) + 1;
    	int end = breakList.get(i);
    	
    	String substr = s.substring(begin, end);
    	if (substr.length() > 0) substrList.add(substr);
    }
    
    // 將每一段子字串以遞迴方式再處理
    for (int i=0; i<substrList.size(); i++) 
    {
    	String substr = substrList.get(i);
    	if (substr.length() < k) continue;
    	
    	int sublen = this.longestSubstring(substr, k);
      if (sublen > max_len) max_len = sublen;
    }

    return max_len;
  }
}
