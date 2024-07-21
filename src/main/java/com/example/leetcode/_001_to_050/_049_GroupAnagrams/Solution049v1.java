package com.example.leetcode._001_to_050._049_GroupAnagrams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

public class Solution049v1 implements Solution049
{
  public List<List<String>> groupAnagrams(String[] strs) 
  {
    List<List<String>> res = new ArrayList<List<String>>();
  
    if(strs == null || strs.length == 0) return res;
    
    HashMap<String, ArrayList<String>> map = new HashMap<String, ArrayList<String>>();
    
    for(int i=0; i<strs.length; i++)
    {
      char[] charArr = strs[i].toCharArray();
      Arrays.sort(charArr);
      String str = new String(charArr);
      
      if (map.containsKey(str)) {
        map.get(str).add(strs[i]);
      }
      else {
        ArrayList<String> list = new ArrayList<String>();
        list.add(strs[i]);
        map.put(str,list);
      }
    }
    
    Iterator<ArrayList<String>> it = map.values().iterator();
    while (it.hasNext()) 
    {
      ArrayList<String> item = (ArrayList<String>) it.next();
      Collections.sort(item);
      res.add(item);
    }
    
    return res;
  }
}
