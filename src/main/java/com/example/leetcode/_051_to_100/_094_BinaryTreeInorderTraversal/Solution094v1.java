package com.example.leetcode._051_to_100._094_BinaryTreeInorderTraversal;

import java.util.LinkedList;
import java.util.List;

import com.example.leetcode.utils.TreeNode;

public class Solution094v1 implements Solution094
{
  public List<Integer> inorderTraversal(TreeNode root) 
  {
    List<Integer> tree = new LinkedList<Integer>();
    
    if (root == null) return tree;
    
    if (root.left != null) tree.addAll(inorderTraversal(root.left));
    tree.add(root.val);
    if (root.right != null) tree.addAll(inorderTraversal(root.right));
    
    return tree;
  }
}
