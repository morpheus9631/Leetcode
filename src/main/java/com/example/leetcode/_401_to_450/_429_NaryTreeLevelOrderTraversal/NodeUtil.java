package com.example.leetcode._401_to_450._429_NaryTreeLevelOrderTraversal;

import java.util.List;

public class NodeUtil 
{
  public static String toString(Node node)
  {
    StringBuffer sb = new StringBuffer();
    
    sb.append(String.format("Value: %d", node.val));
    
    sb.append("\r\nChildrens: [ ");
    List<Node> list = node.children;
    for (int i=0; i<list.size(); i++) {
      if (i > 0) sb.append(", ");
      sb.append(list.get(i).val);
    }
    sb.append(" ]");
    
    return sb.toString();
  }
}
