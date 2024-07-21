package com.example.leetcode._401_to_450._401_BinaryWatch;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/*
 * Your runtime beats 3.28% of java submissions.
 */

public class Solution401v3 implements Solution401
{
  public List<String> readBinaryWatch(int num)
  {
    List<String> res = new LinkedList<String>();

    String format = "%d:%02d";
    
    List<List<Integer>> hourArray = this.getHoursList();
    System.out.println(hourArray.toString());
    
    List<List<Integer>> minuteArray = this.getMinutesList();
    System.out.println(minuteArray.toString());
    
    for (int i=0; i<4; i++)
    {
      for (int j=0; j<6; j++)
      {
        if (i+j != num) continue;
        
        List<Integer> hours = hourArray.get(i);
        List<Integer> minutes = minuteArray.get(j);
        
        for (Integer hour : hours)
        {
          for (Integer minute : minutes)
            res.add(String.format(format, hour, minute));
        }
      }
    }
    
    return res;
  }
  
  private List<List<Integer>> getHoursList()
  {
    List<List<Integer>> listlist =  new ArrayList<List<Integer>>();
    
    for (int i=0; i<4; i++) listlist.add(new ArrayList<Integer>());
    
    for (int i=0; i<12; i++) {
      listlist.get(Integer.bitCount(i)).add(i);
    }
    
    return listlist;
  }
    
  private List<List<Integer>> getMinutesList()
  {
    List<List<Integer>> listlist =  new ArrayList<List<Integer>>();
      
    for (int i=0; i<6; i++) listlist.add(new ArrayList<Integer>());
    
    for (int i=0; i<60; i++) {
      listlist.get(Integer.bitCount(i)).add(new Integer(i));
    }
    
    return listlist;
  }
}
