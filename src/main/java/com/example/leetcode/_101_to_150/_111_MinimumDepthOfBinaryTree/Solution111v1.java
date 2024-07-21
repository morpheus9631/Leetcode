package com.example.leetcode._101_to_150._111_MinimumDepthOfBinaryTree;

import com.example.leetcode.utils.TreeNode;

/*
 * Your runtime beats 21.81% of java submissions.
 */

public class Solution111v1 implements Solution111
{
  public int minDepth(TreeNode root)
  {
    if (root == null) return 0;
    if (root.left == null && root.right == null) return 1;
    
    if (root.left != null && root.right == null)
      return 1 + minDepth(root.left);
    
    if (root.left == null && root.right != null)
      return 1 + minDepth(root.right);
    
    return 1 + Math.min(minDepth(root.left), minDepth(root.right)); 
  }
}
