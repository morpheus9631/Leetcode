package com.example.leetcode._101_to_150._113_PathSumII;

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

public class Solution113v1 implements Solution113
{
  public List<List<Integer>> pathSum(TreeNode root, int sum) 
  {
    List<List<Integer>> res = new ArrayList<List<Integer>>();
    pathSum(root, sum, res, new ArrayList<Integer>());
    return res;
  }
  
  private void pathSum(TreeNode root, int sum, List<List<Integer>> res, List<Integer> sol)
  {
    if (root == null) return;

    sum -= root.val;

    if (root.left == null && root.right == null) 
    {
      if (sum == 0) 
      {
        sol.add(root.val);
        res.add(new ArrayList<Integer>(sol));
        sol.remove(sol.size()-1);
      }
      return;
    }

    sol.add(root.val);
    pathSum(root.left, sum, res, sol);
    pathSum(root.right, sum, res, sol);
    sol.remove(sol.size()-1);  
  }  
}