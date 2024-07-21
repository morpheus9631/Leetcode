package com.example.leetcode._201_to_250._235_LowestCommonAncestor_of_a_BinarySearchTree;

import com.example.leetcode.utils.TreeNode;

/*
 * Your runtime beats 67.34% of java submissions.
 */

/*
　　解題思路：
　　　　對於 p，q 和 root，
　　　　如果 p 和 q 都比 root 小，那麼 LCA 必定在root的左子樹上面；
　　　　如果 p 和 q 都比 root 大，那麼 LCA 必定在右子樹上面；
　　　　如果一大一小，那麼 root 即為該值。
 */

public class Solution235v3 implements Solution235
{
  public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q)
  {
    if (root == null || p == null || q == null) return null;
    
    if (Math.max(p.val, q.val) < root.val)
      return lowestCommonAncestor(root.left, p, q);
    else if (Math.min(p.val, q.val) > root.val)
      return lowestCommonAncestor(root.right, p, q);
    else
      return root;  
  }
}
