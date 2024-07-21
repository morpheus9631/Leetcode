package com.example.leetcode._001_to_050._049_GroupAnagrams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution049v2 implements Solution049
{
  public List<List<String>> groupAnagrams(String[] strs) 
  {
    List<List<String>> results = new ArrayList<List<String>>();
    
    List<String> strList = new ArrayList<String>(Arrays.asList(strs));
    while (strList.size() > 0)
    {
      List<String> tmpList = new ArrayList<String>();

      String str = strList.get(0);
      
      if (str.length() < 2)
      {
        while (strList.contains(str))
        {
          tmpList.add(str);
          strList.remove(str);
        }
        results.add(tmpList);
        continue;
      }
      
      List<String> perms = new ArrayList<String>();
      permutation(str.toCharArray(), 0, perms);
      
      for (String s : perms) 
      {
        while (strList.contains(s))
        {
          tmpList.add(s);
          strList.remove(s);
        }
      }
      results.add(tmpList);
    }
    
    return results;
  }
  
  public void permutation(char[] chars, int start, List<String> perms)
  {
    if (start == chars.length-1)
    {
      StringBuffer sb = new StringBuffer();
      for (char ch : chars) sb.append(ch);
      perms.add(sb.toString());
      return;
    }
    for (int i=start; i<chars.length; i++)
    {
      char ch = chars[i]; chars[i] = chars[start]; chars[start] = ch;
      permutation(chars, start+1, perms);
      ch = chars[i]; chars[i] = chars[start]; chars[start] = ch;
    }
  }
}
