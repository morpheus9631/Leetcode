package com.example.leetcode._401_to_450._429_NaryTreeLevelOrderTraversal;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;

public class Solution0429v1 implements Solution0429 
{
  @Override
  public List<List<Integer>> levelOrder(Node root)
  {
    List<List<Integer>> result = new ArrayList<>();
    if (root == null) return result;

    Queue<Node> queue = new ArrayDeque<>();
    queue.add(root);

    while (!queue.isEmpty()) {
        int size = queue.size();
        List<Integer> currentList = new ArrayList<>();
        while (size > 0) {
            Node node = queue.poll();
            currentList.add(node.val);
            if (node.children != null) {
                queue.addAll(node.children);
            }
            size--;
        }
        result.add(currentList);
    }
    return result;
  }
}
