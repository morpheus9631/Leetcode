package com.example.leetcode._401_to_450._404_SumOfLeftLeaves;

import com.example.leetcode.utils.TreeNode;

/*
 * Your runtime beats 37.97% of java submissions.
 */

public class Solution404v1 implements Solution404
{
  public int sumOfLeftLeaves(TreeNode root)
  {
    if (root == null) return 0;
    
    int sum = 0;
    
    if ((root.left != null) &&
        (root.left.left == null && root.left.right == null))
      sum += root.left.val;

    sum += sumOfLeftLeaves(root.left);
    sum += sumOfLeftLeaves(root.right);
    
    return sum;
  }
}
