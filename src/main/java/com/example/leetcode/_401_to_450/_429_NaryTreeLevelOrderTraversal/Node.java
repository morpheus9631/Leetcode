package com.example.leetcode._401_to_450._429_NaryTreeLevelOrderTraversal;

import java.util.List;

public class Node 
{
  public int val;
  public List<Node> children;

  public Node() {}

  public Node(int _val, List<Node> _children) {
      val = _val;
      children = _children;
  }
}

 