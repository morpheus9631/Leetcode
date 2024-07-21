package com.example.leetcode._051_to_100._100_SameTree;

import com.example.leetcode.utils.TreeNode;

/*
 * Your runtime beats 0.26% of java submissions.
 */

public class Solution100v1 implements Solution100
{
  boolean isSame = true;

  public boolean isSameTree(TreeNode p, TreeNode q) 
  {
    DFS(p, q);
    return isSame;
  }
  
  private void DFS(TreeNode p, TreeNode q)
  {
    if (p == null && q == null) return;

    if ((p == null && q != null) || (p != null && q == null))
    {
      isSame = false;
      return;
    }

    if (p.val != q.val) 
    {  
      isSame = false;
      return;
    }  
    
    DFS(p.left, q.left);
    DFS(p.right, q.right);
  }
}
