package com.example.leetcode._401_to_450._401_BinaryWatch;

import java.util.LinkedList;
import java.util.List;

/*
 * Your runtime beats 80.32% of java submissions.
 * 
 * Using String.format(): Your runtime beats 47.19% of java submissions.
 */

public class Solution401v1 implements Solution401
{
  public List<String> readBinaryWatch(int num)
  {
    List<String> list = new LinkedList<String>();
    
    for (int h=0; h<12; h++)
    {
      for(int m=0; m<60; m++)
      {
        if (Integer.bitCount(h << 6 ^ m) == num)
          list.add(h+":"+(m>=10 ? m : "0"+m));
      }
    }
    
    return list;
  }
}

