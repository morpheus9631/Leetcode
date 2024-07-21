package com.example.leetcode.utils;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;
import java.util.Set;

public class DWGraph
{
  // Adjacenct table: Map<SrcNode, Hashtable<DestNode, Weight>>
  Map<String, Hashtable<String, Double>> _AdjWeiTable = 
      new HashMap<String, Hashtable<String, Double>>();

  public DWGraph(String[][] edges, double[] values)
  {
    if (edges == null) throw new IllegalArgumentException("Illegal edges");
    
    int rows = edges.length;
    if (rows == 0) return;
    
    int cols = edges[0].length;
    if (cols != 2) return;

    Hashtable<String, Double> table = null;
    for (int i=0; i<rows; i++)
    {
      String srcNode = edges[i][0];
      String dstNode = edges[i][1];
      
      // 敺� srcNode --> dstNode, 甈�  values[i] 
      if (_AdjWeiTable.containsKey(srcNode) == false) {
        _AdjWeiTable.put(srcNode, new Hashtable<String, Double>());
      }
      
      table = _AdjWeiTable.get(srcNode);
      
      if (!table.containsKey(dstNode)) 
      {
        table.put(dstNode, values[i]);
        _AdjWeiTable.put(srcNode, table);
      }
    }
  }

  public double DFS(String srcNode, String dstNode)
  {
    double sum = 1.0;
    
    if (!_AdjWeiTable.containsKey(srcNode)) return -1.0;
    
    if (srcNode.equals(dstNode)) return 1.0;

    Hashtable<String, Double> table = _AdjWeiTable.get(srcNode);
    if (table.containsKey(dstNode)) 
    {
      double w1 = table.get(dstNode);
      System.out.println("  " + srcNode + " -> " + dstNode + ",\tw2: " + w1);
      return w1;
    }
    else
    {
      for (String midNode : table.keySet()) 
      {
        double w1 = table.get(midNode);
        System.out.println("  " + srcNode + " -> " + midNode + ",\tw1: " + w1);
        
        double w2 = DFS(midNode, dstNode);
        sum = (w2 == -1.0) ? -1.0 : w1 * w2;  
      }
    }
    
    return sum;
  }
  
  public String toString()
  {
    String outstr = "[";
    
    Set<String> keySet = _AdjWeiTable.keySet();
    for (String srcNode : keySet)
    {
      Hashtable<String , Double> table = _AdjWeiTable.get(srcNode);
      
      outstr += "\r\n  " + srcNode + " -> ";
      Set<String> dstNodes = table.keySet();
      for(String dstNode : dstNodes)
      {
        double val = table.get(dstNode);
        outstr += dstNode + " (" + val + "), ";
      }
      outstr = outstr.substring(0, outstr.length()-2);
    }
    
    outstr += "\r\n]";
    return outstr;
  }
}