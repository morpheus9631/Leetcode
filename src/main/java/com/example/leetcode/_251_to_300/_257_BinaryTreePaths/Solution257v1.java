package com.example.leetcode._251_to_300._257_BinaryTreePaths;

import java.util.LinkedList;
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
public class Solution257v1 implements Solution257
{
  public List<String> binaryTreePaths(TreeNode root) 
  {
    List<String> allPath = new LinkedList<String>();
    if (root == null) return allPath;
    
    DFS(root, String.valueOf(root.val), allPath);
    return allPath;
  }
  
  public void DFS(TreeNode currNode, String path, List<String> allPath)
  {
    if (currNode == null) return;
    
    if (currNode.left == null && currNode.right == null) {
      allPath.add(path);
      return;
    }  
    
    if (currNode.left != null) 
    {
      String str = path + "->" + String.valueOf(currNode.left.val);
      DFS(currNode.left, str, allPath);
    }
    
    if (currNode.right != null) 
    {
      String str = path + "->" + String.valueOf(currNode.right.val);
      DFS(currNode.right, str, allPath);
    }
  }
}