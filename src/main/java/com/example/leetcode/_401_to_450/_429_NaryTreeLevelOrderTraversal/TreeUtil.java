package com.example.leetcode._401_to_450._429_NaryTreeLevelOrderTraversal;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class TreeUtil 
{
  public static Node createTree(int[][][] data)
  {
    HashMap<Integer, Node> nodeMap = new HashMap<Integer, Node>();
    
    for (int[][] arrays: data)
    {
      int parentVal = arrays[0][0];
      
      Node parentNode = null;
      if (nodeMap.containsKey(parentVal)) {
        parentNode = nodeMap.get(parentVal);
      } else {
        List<Node> childrens = new ArrayList<Node>();
        parentNode = new Node(parentVal, childrens);
        nodeMap.put(parentVal,  parentNode);
      }
        
      int[] chilVals = arrays[1];
      for (int chilVal : chilVals) 
      {
        List<Node> childrens = new ArrayList<Node>();
        Node chilNode = new Node(chilVal, childrens);
        parentNode.children.add(chilNode);
        nodeMap.put(chilVal, chilNode);
      }
    }
    
    int rootVal = data[0][0][0];
    Node root = nodeMap.get(rootVal);
    return root;
  }
}
