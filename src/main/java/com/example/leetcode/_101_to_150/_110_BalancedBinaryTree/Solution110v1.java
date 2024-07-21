package com.example.leetcode._101_to_150._110_BalancedBinaryTree;

import com.example.leetcode.utils.TreeNode;

/*
 * Your runtime beats 27.15% of java submissions.
 */

public class Solution110v1 implements Solution110
{
  public boolean isBalanced(TreeNode root) 
  {
    if (root == null) return true;
    
    int lh = getMaxHeight(root.left);
    int rh = getMaxHeight(root.right);
    int diff = lh-rh;
    
    if (diff > 1 || diff < -1) 
      return false;
    else
      return isBalanced(root.left) && isBalanced(root.right); 
  }
  
  private int getMaxHeight(TreeNode root)
  {
    if (root == null) return 0;
    if (root.left == null && root.right == null) return 1;
    
    int l_height = getMaxHeight(root.left);
    int r_height = getMaxHeight(root.right);
    
    return 1+ Math.max(l_height, r_height);
  }
}
