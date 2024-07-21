package com.example.leetcode._301_to_350._332_ReconstructItinerary;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Solution332v1 implements Solution332
{
  Map<String, List<String>> map = null;
  
  public List<String> findItinerary(String[][] tickets) 
  {
    List<String> res = new ArrayList<String>();
    
    createAdjTable(tickets);
    
    String begin = "JFK";
    res.add(begin);
    DFS(begin, tickets.length, res, new ArrayList<String>());
    
    return res;
  }
  
  private void createAdjTable(String[][] tickets)
  {
    map = new HashMap<String, List<String>>();
    
    for (String[] ticket : tickets)
    {
      String from = ticket[0];
      String to  = ticket[1];
      if (!map.containsKey(from)) map.put(from, new ArrayList<String>());
      map.get(from).add(to);
    }
    
    for (List<String> list : map.values()) 
      Collections.sort(list);
  }
  
  private void DFS(String src, int num, List<String> res, List<String> path)
  {
    if (res.size() > 1) return;
    
    if (path.size() == num) { res.addAll(path); return; }
    
    List<String> dests = map.get(src);
    if (dests == null || dests.size() == 0) return;
    
    for(int i=0; i<dests.size(); i++) 
    {
      String des = dests.remove(i);
      path.add(des);
      DFS(des, num, res, path);
      dests.add(i, des);
      path.remove(path.size()-1);
    }
  }  
}
