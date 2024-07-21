package com.example.leetcode._401_to_450._404_SumOfLeftLeaves;

import com.example.leetcode.utils.TreeNode;

/*
 * Your runtime beats 59.97% of java submissions.
 */

public class Solution404v2 implements Solution404{
  public int sumOfLeftLeaves(TreeNode root)
  {
    if (root == null) return 0;
    
    boolean leftIsLeaf = ((root.left != null) &&
                          (root.left.left == null && root.left.right == null));
    int sum = leftIsLeaf ? root.left.val : 0;

    sum += sumOfLeftLeaves(root.left);
    sum += sumOfLeftLeaves(root.right);
    
    return sum;
  }
}
