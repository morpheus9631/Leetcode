package com.example.leetcode._151_to_200._199_BinaryTreeRightSideView;

import java.util.ArrayList;
import java.util.List;

import com.example.leetcode.utils.TreeNode;

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */

public class Solution199v1 implements Solution199
{
  public List<Integer> rightSideView(TreeNode root) 
  {
    List<Integer> res = new ArrayList<Integer>();
    if (root == null) return res;

    List<TreeNode> openList = new ArrayList<TreeNode>();
    openList.add(root);
    
    do {
      res.add(openList.get(openList.size()-1).val);
      
      List<TreeNode> closeList = new ArrayList<TreeNode>();
      while (!openList.isEmpty())
      {
        TreeNode t = openList.remove(0);
        if (t.left != null) closeList.add(t.left);
        if (t.right != null) closeList.add(t.right);
      }
      openList.addAll(closeList);
    } while (!openList.isEmpty());

    return res;
  }
}