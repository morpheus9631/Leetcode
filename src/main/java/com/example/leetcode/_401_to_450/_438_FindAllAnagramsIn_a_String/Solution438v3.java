package com.example.leetcode._401_to_450._438_FindAllAnagramsIn_a_String;

import java.util.LinkedList;
import java.util.List;

/*
 * Time Limit Exceeded
 */

public class Solution438v3 implements Solution438 
{
  public List<Integer> findAnagrams(String s, String p)
  {
    List<Integer> list = new LinkedList<Integer>();
    
    int len1 = s.length();
    int len2 = p.length();
    if (len1 < len2) return list;

    for (int i=0; i<=len1-len2; i++)
    {
      int sum1 = 0;
      int sum2 = 0;
      boolean isExist = true;
      
      outerloop:
      for (int j=0; j<len2; j++) 
      {
        char ch1 = s.charAt(i+j);
        if (!p.contains(ch1+""))
        {
          isExist = false;
          break outerloop;
        }
        sum1 += ch1;
        sum2 += p.charAt(j);
        //System.out.println(ch1+", "+isExist+", "+sum1);
      }
      if (isExist && sum1 == sum2) list.add(i);
      
      //System.out.println();
    }
    return list;
  }
}
