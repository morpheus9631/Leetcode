package com.example.leetcode._101_to_150._104_MaximumDepthOfBinaryTree;

import com.example.leetcode.utils.TreeNode;

/*
 * Your runtime beats 18.63% of java submissions
 */

public class Solution104v2 implements Solution104
{
  public int maxDepth(TreeNode root)
  {
    if (root == null) return 0;
    return 1 + Math.max(maxDepth(root.left), maxDepth(root.right));    
  }
}
