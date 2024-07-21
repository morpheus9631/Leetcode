package com.example.leetcode._101_to_150._111_MinimumDepthOfBinaryTree;

import java.util.LinkedList;
import java.util.Queue;

import com.example.leetcode.utils.TreeNode;

/*
 * Your runtime beats 21.81% of java submissions.
 */

public class Solution111v2 implements Solution111
{
  public int minDepth(TreeNode root)
  {
    if (root == null) return 0;
    
    Queue<TreeNode> queue = new LinkedList<TreeNode>();
    queue.add(root);

    int depth = 1;
    while (!queue.isEmpty())
    {
      int size = queue.size();
      
      for (int i=0; i<size; i++)
      {
        TreeNode node = queue.poll();
        
        if (node.left == null && node.right == null)
          return depth;
        
        if (node.left != null) queue.add(node.left); 
        if (node.right != null) queue.add(node.right); 
      }
      depth++;
    }
    return depth; 
  }
}
