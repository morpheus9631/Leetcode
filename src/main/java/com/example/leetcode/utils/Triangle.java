package com.example.leetcode.utils;

import java.util.ArrayList;
import java.util.List;

public class Triangle
{
  public static String toString(final List<List<Integer>> listList)
  {
    StringBuilder sb = new StringBuilder();
    
    int tab_len = listList.size() - 1;
    for (List<Integer> list : listList)
    {
      sb.append(myStringUtils.repeat(tab_len--, " "))
        .append(list.toString())
        .append("\r\n");
    }
    int idx = sb.lastIndexOf("\r\n");
    sb.delete(idx, sb.length());
    
    return sb.toString();  
  }
  
  public static List<List<Integer>> toTriangle(int[][] array)
  {
    List<List<Integer>> listList = new ArrayList<List<Integer>>();
    
    for (int i=0; i<array.length; i++)
    {
      List<Integer> list = myInts.asList(array[i]);
      listList.add(list);
    }
    return listList;
  }
}
  
  
