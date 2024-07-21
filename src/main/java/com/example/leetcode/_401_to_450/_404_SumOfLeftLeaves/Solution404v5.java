package com.example.leetcode._401_to_450._404_SumOfLeftLeaves;

import com.example.leetcode.utils.TreeNode;

/*
 * Your runtime beats 87.14% of java submissions.
 * 
 * or 
 * 
 * Your runtime beats 37.88% of java submissions.
 * 
 * or 
 * 
 * Your runtime beats 6.12% of java submissions.
 */

public class Solution404v5 implements Solution404
{
  public int sumOfLeftLeaves(TreeNode root)
  {
    if (root == null) return 0;

    int sum = sumOfLeaves(root, false);
    return sum;
  }
  
  private int sumOfLeaves(TreeNode node, boolean isLeft)
  {
    if (isLeft && node.left == null && node.right == null)
      return node.val;
    
    int sum = 0;
    if (node.left != null) sum += sumOfLeaves(node.left, true);
    if (node.right != null) sum += sumOfLeaves(node.right, false);
    return sum;
  }
}
