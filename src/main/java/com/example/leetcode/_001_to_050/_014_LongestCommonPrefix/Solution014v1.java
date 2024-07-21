package com.example.leetcode._001_to_050._014_LongestCommonPrefix;

/*
 * Your runtime beats 41.31% of java submissions
 */

public class Solution014v1 implements Solution014
{
  public String longestCommonPrefix(String[] strs)
  {
    if (strs == null) return null;
    if (strs.length == 0) return "";
    if (strs.length == 1) return strs[0];
    
    String result = getLCPS(strs[0], strs[1]);
    
    for (int i=2; i<strs.length; i++) {
      result = getLCPS(result, strs[i]);
    }
    
    return result;
  }
  
  private String getLCPS(String str1, String str2)
  {
    StringBuilder sb = new StringBuilder();
    
    int i = 0, j = 0;
    int len1 = str1.length();
    int len2 = str2.length();
    while (i < len1 && j < len2 && str1.charAt(i) == str2.charAt(j))
    {
      sb.append(str1.charAt(i));
      i++; j++;
    }
    
    return sb.toString();
  }
}
