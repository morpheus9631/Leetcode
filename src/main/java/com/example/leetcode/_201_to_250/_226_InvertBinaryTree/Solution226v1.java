package com.example.leetcode._201_to_250._226_InvertBinaryTree;

import java.util.LinkedList;
import java.util.Queue;

import com.example.leetcode.utils.TreeNode;

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */

public class Solution226v1 implements Solution226
{
  public TreeNode invertTree(TreeNode root) 
  {
    if (root == null) return null;

    Queue<TreeNode> queue = new LinkedList<TreeNode>();
    queue.offer(root);
    
    while (!queue.isEmpty())
    {
      TreeNode node = queue.poll();
      
      TreeNode left = node.left;
      node.left = node.right;
      node.right = left;
      
      if (node.left != null) queue.add(node.left);
      if (node.right != null) queue.add(node.right);
    }
    
    return root;
  }
}