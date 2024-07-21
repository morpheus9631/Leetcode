package com.example.leetcode._201_to_250._235_LowestCommonAncestor_of_a_BinarySearchTree;

import com.example.leetcode.utils.TreeNode;

/*
 * Your runtime beats 36.45% of java submissions.
 */

public class Solution235v2 implements Solution235
{
  public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q)
  {
    if(p.val > root.val && q.val > root.val)
      return lowestCommonAncestor(root.right, p, q);
    else if(p.val < root.val && q.val < root.val)
      return lowestCommonAncestor(root.left, p, q);  
    return root;  
  }
}
