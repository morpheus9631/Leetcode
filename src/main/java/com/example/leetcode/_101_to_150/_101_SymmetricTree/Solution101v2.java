package com.example.leetcode._101_to_150._101_SymmetricTree;

import java.util.LinkedList;
import java.util.List;

import com.example.leetcode.utils.TreeNode;

/*
 * Iterative way: Your runtime beats 13.79% of java submissions.
 */

public class Solution101v2 implements Solution101
{
  public boolean isSymmetric(TreeNode root)
  {
    if (root == null) return true;
    
    List<TreeNode> leftList = new LinkedList<TreeNode>();
    List<TreeNode> rightList = new LinkedList<TreeNode>();
    leftList.add(root.left);
    rightList.add(root.right);
   
    while (!leftList.isEmpty() && !rightList.isEmpty())
    {
      TreeNode left = leftList.remove(0);
      TreeNode right = rightList.remove(0);

      if (left == null && right == null) continue;
     
      if (left == null && right != null) return false;
      if (right == null && left != null) return false; 
     
      if (left.val != right.val) 
        return false;
      else
      {
        leftList.add(left.left);
        leftList.add(left.right);
        rightList.add(right.right);
        rightList.add(right.left);
      }
    }
    if (!leftList.isEmpty() || !rightList.isEmpty())
      return false;
   
   return true;
  }
}
