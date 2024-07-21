package com.example.leetcode._101_to_150._112_PathSum;

import com.example.leetcode.utils.TreeNode;

/*
 * Your runtime beats 15.74% of java submissions.
 */

public class Solution112v3 implements Solution112
{
  public boolean hasPathSum(TreeNode root, int sum) 
  {
    if( root == null) return false;
    
    if( root.left == null && root.right == null)
        return sum == root.val;

    return hasPathSum(root.left,sum-root.val) || 
           hasPathSum(root.right,sum-root.val);
  }
}
