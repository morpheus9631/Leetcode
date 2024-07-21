package com.example.leetcode._151_to_200._199_BinaryTreeRightSideView;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

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

public class Solution199v3 implements Solution199
{
  public List<Integer> rightSideView(TreeNode root) 
  {
    List<Integer> res = new ArrayList<Integer>();
    if (root == null) return res;

    Queue<TreeNode> queue = new LinkedList<TreeNode>();
    queue.add(root);
    int count = 1;
    int next_cnt = 0;
    
    while (!queue.isEmpty())
    {
      TreeNode node = queue.remove();
      count--;
      
      if (node.left != null) {
        queue.add(node.left);
        next_cnt++;
      }
      
      if (node.right != null) {
        queue.add(node.right);
        next_cnt++;
      }
      
      if (count == 0)
      {
        res.add(node.val);
        count = next_cnt; 
        next_cnt = 0;
      }  
    }  
    return res;
  }
}