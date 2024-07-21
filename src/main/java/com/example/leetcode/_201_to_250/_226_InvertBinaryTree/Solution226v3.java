package com.example.leetcode._201_to_250._226_InvertBinaryTree;

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

public class Solution226v3 implements Solution226
{
  public TreeNode invertTree(TreeNode root) 
  {
    if (root != null) 
    {
      TreeNode left = root.left;
      root.left = root.right;
      root.right = left;

      invertTree(root.left);
      invertTree(root.right);
    }
    return root;
  }
}