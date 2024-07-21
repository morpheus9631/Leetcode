package com.example.leetcode._101_to_150._112_PathSum;

import com.example.leetcode.utils.TreeNode;

/*
 * Your runtime beats 17.25 % of java submissions.
 */

public class Solution112v1 implements Solution112
{
  private boolean isFind;
  
  public boolean hasPathSum(TreeNode root, int sum)
  {
    isFind = false;
    DFS(root, sum);
    return isFind;
  }  
  
  private void DFS(TreeNode node, int target)
  {
    if (node == null || isFind) return;

    target -= node.val;

    if (target == 0 && node.left == null && node.right == null) 
    { 
      isFind = true; return; 
    }
    else
    {
      DFS(node.left, target);
      DFS(node.right, target);
    }
  }
}
