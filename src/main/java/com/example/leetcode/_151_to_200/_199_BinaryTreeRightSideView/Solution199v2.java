package com.example.leetcode._151_to_200._199_BinaryTreeRightSideView;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

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

public class Solution199v2 implements Solution199 
{
  public List<Integer> rightSideView(TreeNode root) 
  {
    List<Integer> res = new ArrayList<Integer>();
    if (root == null) return res;

    Map<Integer, Integer> map = new HashMap<Integer, Integer>();
    preorder(root, 1, map);

    int depth = 1;
    while (map.containsKey(depth)) {
      res.add(map.get(depth++));
    }  
    return res;
  }
  
  private void preorder(TreeNode root, int depth, Map<Integer, Integer> map)
  {
    if (root == null) return ;
    
    map.put(depth,  root.val);
    if (root.left != null) preorder(root.left, depth+1, map);
    if (root.right != null) preorder(root.right, depth+1, map);
  }
}