package com.example.leetcode._101_to_150._101_SymmetricTree;

import com.example.leetcode.utils.TreeNode;

/*
 * Recursion version: Your runtime beats 24.26% of java submissions.
 */

public class Solution101v1 implements Solution101
{
  public boolean isSymmetric(TreeNode root)
  {
    if (root == null) return true;
    return isMirror(root.left, root.right);
  }
  
  private boolean isMirror(TreeNode left, TreeNode right)
  {
    if (left == null && right == null) return true;
    
    if (left == null || right == null) return false;
    
    if (left.val != right.val) return false;
    
    return isMirror(left.left, right.right) && 
           isMirror(left.right, right.left); 
  }
}
