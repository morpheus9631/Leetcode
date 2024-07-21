package com.example.leetcode._401_to_450._401_BinaryWatch;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

/*
 *  Time Limit Exceeded
 */

public class Solution401v2 implements Solution401
{
  public List<String> readBinaryWatch(int num)
  {
    List<String> res = new LinkedList<String>();
    
    int[] leds = new int[10];
    for (int i=0; i<num; i++) leds[i] = 1;
    
    List<List<Integer>> listlist = new ArrayList<List<Integer>>(); 
    permute(leds, 0, leds.length, listlist); 

    for (List<Integer> list : listlist)
    {
      int h = 0;
      for (int i=0; i<4; i++)
      {
        if (list.get(i) == 0) continue;
        h += Math.pow(2.0, i);
      }
      if (h > 11) continue;
      
      int m = 0;
      for (int i=4; i<10; i++)
      {
        if (list.get(i) == 0) continue;
        m += Math.pow(2.0, i-4);
      }
      if (m > 59) continue;
      res.add(h + ":" + (m >= 10 ? m : "0" + m));
    }
    Collections.sort(res);
    return res;
  }
  
  private void permute(int[] leds, int start, int len, List<List<Integer>> listlist)
  {
    if (start == len) 
    {
      List<Integer> list = new ArrayList<Integer>();
      for (int led : leds) list.add(led);
      if (!listlist.contains(list)) listlist.add(list);
      return;
    }
    else
    {
      int tmp;
      for (int i=start; i<len; i++)
      {
        tmp = leds[start]; leds[start] = leds[i]; leds[i] = tmp;
        permute(leds, start+1, len, listlist);
        tmp = leds[start]; leds[start] = leds[i]; leds[i] = tmp;;
      }
    }
  }
}
