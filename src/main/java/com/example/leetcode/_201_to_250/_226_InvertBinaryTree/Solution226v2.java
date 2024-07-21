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

public class Solution226v2 implements Solution226
{
  public TreeNode invertTree(TreeNode root) 
  {
    if (root == null) return null;

    TreeNode left = root.left;
    TreeNode right = root.right;
    
    root.left = invertTree(right);
    root.right = invertTree(left);
    
    return root;
  }
}