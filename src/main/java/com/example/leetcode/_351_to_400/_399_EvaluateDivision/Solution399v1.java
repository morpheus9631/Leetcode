package com.example.leetcode._351_to_400._399_EvaluateDivision;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Stack;

public class Solution399v1 implements Solution399
{
  public double[] calcEquation(String[][] equations, double[] values, String[][] queries) 
  {
    DWGraph dwg = new DWGraph(equations, values);

    int len = queries.length;
    double[] res = new double[len];
    
    for (int i=0; i<len; i++)
    {
      String srcNode = queries[i][0];
      String dstNode = queries[i][1];
      double val = dwg.DFS(srcNode, dstNode);
      res[i] = val;
    }
    
    return res;
  }
  
  public class DWGraph
  {
    private Set<String> _Vertexs = new HashSet<String>();
    
    //private Set<String> _Visited = new HashSet<String>();
    
    /*
     * Adjacent table: Map<SrcNode, Hashtable<DestNode, Weight>>
     */
    private Map<String, Hashtable<String, Double>> _AdjWeiTable = 
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
        
        if (!_Vertexs.contains(srcNode)) _Vertexs.add(srcNode);
        if (!_Vertexs.contains(dstNode)) _Vertexs.add(dstNode);
        
        // 從 srcNode --> dstNode, 權重為  values[i] 
        if (!_AdjWeiTable.containsKey(srcNode)) {
          _AdjWeiTable.put(srcNode, new Hashtable<String, Double>());
        }
        
        table = _AdjWeiTable.get(srcNode);
        
        if (!table.containsKey(dstNode)) 
        {
          table.put(dstNode, values[i]);
          _AdjWeiTable.put(srcNode, table);
        }
        
        // 從 dstNode --> srcNode, 權重為  1.0 / values[i] 
        if (!_AdjWeiTable.containsKey(dstNode)) {
          _AdjWeiTable.put(dstNode, new Hashtable<String, Double>());
        }
        
        table = _AdjWeiTable.get(dstNode);
        
        if (!table.containsKey(srcNode)) 
        {
          table.put(srcNode, 1.0 / values[i]);
          _AdjWeiTable.put(dstNode, table);
        }
      }
    }
    
    public double DFS(String srcNode, String dstNode)
    {
      double res = 1.0;
      
      if (!_Vertexs.contains(srcNode)) return -1.0;
      if (!_Vertexs.contains(dstNode)) return -1.0;
      if (srcNode.equals(dstNode)) return 1.0;
      
      // clear visited array
      Set<String> visited = new HashSet<String>(); 
      
      List<String> pathList = new LinkedList<String>();
      Stack<String> stack = new Stack<String>(); 
      stack.push(srcNode);
      
      boolean isFound = false;
      while (!stack.isEmpty() && !isFound)
      {
        String currNode = stack.pop();
        
        Hashtable<String, Double> table = _AdjWeiTable.get(currNode);
        Set<String> sonNodes = new HashSet<String>(table.keySet());
        
        // 先將已經尋訪過的節點刪除，尋訪剩餘節點，如果沒有剩餘節點可尋訪，那麼 currNode 必不在目標節點的路徑上
        sonNodes.removeAll(visited);
        if (sonNodes.isEmpty()) continue;

        visited.add(currNode);
        pathList.add(currNode);
        
        for (String sonNode : sonNodes)
        {
          isFound = sonNode.equals(dstNode);
          
          if (isFound) 
          {
            pathList.add(sonNode);
            break; 
          }
          else
            stack.push(sonNode);
        }
      }
      
      int size = pathList.size();
      if (size < 2) return -1.0;
      
      for (int i=0; i<size-1; i++)
      {
        String firstNode = pathList.get(i);
        String secondNode = pathList.get(i+1);
        res = res * _AdjWeiTable.get(firstNode).get(secondNode);
      }
      
      return res;
    }
  }
}
