package com.example.leetcode._101_to_150._112_PathSum;

import com.example.leetcode.utils.TreeNode;

/*
 * Your runtime beats 17.25 % of java submissions.
 */

public class Solution112v2 implements Solution112
{
  public boolean hasPathSum(TreeNode root, int sum)
  {
    if (root == null) return false;
    return DFS(root, sum);
  }  
  
  private boolean DFS(TreeNode node, int target)
  {
    if (node.left == null && node.right == null)
      return (target == node.val); 
    
    target -= node.val;
    
    boolean res = false;
    if (node.left != null) res = res || DFS(node.left, target);
    if (node.right != null) res = res || DFS(node.right, target);
    return res;
  }
}
