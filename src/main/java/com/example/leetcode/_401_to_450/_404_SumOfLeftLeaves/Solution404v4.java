package com.example.leetcode._401_to_450._404_SumOfLeftLeaves;

import java.util.LinkedList;
import java.util.List;

import com.example.leetcode.utils.TreeNode;

/*
 * Your runtime beats 37.88% of java submissions.
 */

public class Solution404v4 implements Solution404
{
  public int sumOfLeftLeaves(TreeNode root)
  {
    if (root == null) return 0;

    List<TreeNode> openList = new LinkedList<TreeNode>();
    openList.add(root);
    
    int sum = 0;
    while (!openList.isEmpty())
    {
      TreeNode node = openList.remove(0);
      
      if (node.left != null && node.left.left == null && node.left.right == null)
        sum += node.left.val;
      else if (node.left != null)
        openList.add(node.left);
      
      if (node.right != null) openList.add(node.right);
    }
    return sum;
  }
}
