package com.example.leetcode._301_to_350._310_MinimumHeightTrees;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class Solution310v1 implements Solution310
{
  public List<Integer> findMinHeightTrees(int n, int[][] edges) 
  {
    if (n == 1) return Arrays.asList(0);
    
    Map<Integer, List<Integer>> table = createAdjcencyTable(n, edges);
    
    List<Integer> leaves = new ArrayList<Integer>();
    for (int key : table.keySet()) {
      if (table.get(key).size() == 1) leaves.add(key);
    }

    while (table.keySet().size() > 2)
    {
      List<Integer> newleaves = new ArrayList<Integer>();
      
      for (int leaf : leaves)
      {
        int new_leaf = table.get(leaf).get(0);
        table.remove(leaf);
        table.get(new_leaf).remove(Integer.valueOf(leaf));
        
        if (table.get(new_leaf).size() == 1) newleaves.add(new_leaf);
      }
      leaves = newleaves;
    }
    
    return leaves;
  }
  
  private Map<Integer, List<Integer>> createAdjcencyTable(int n, int[][] edges)
  {
    Map<Integer, List<Integer>> table = new HashMap<Integer, List<Integer>>();    
    
    for (int[] e : edges)
    {
      if (!table.containsKey(e[0])) 
        table.put(e[0], new ArrayList<Integer>());
      table.get(e[0]).add(Integer.valueOf(e[1]));
      
      if (!table.containsKey(e[1])) 
        table.put(e[1], new ArrayList<Integer>());
      table.get(e[1]).add(Integer.valueOf(e[0]));
    }
    
    return table;
  }
}
