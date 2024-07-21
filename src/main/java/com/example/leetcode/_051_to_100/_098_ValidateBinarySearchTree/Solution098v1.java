package com.example.leetcode._051_to_100._098_ValidateBinarySearchTree;

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
public class Solution098v1 implements Solution098
{
  public boolean isValidBST(TreeNode root) 
  {
    if (root == null) return true;
    
    List<Integer> list = inOrderTraversal(root); 
    if (list.size() == 0) return true;
    
    int tmp = list.get(0);
    for (int i=1; i<list.size(); i++)
    {
    	if (tmp >= list.get(i)) return false;
    	tmp = list.get(i);
    }
    
    return true;
  }

  public List<Integer> inOrderTraversal(TreeNode root)
  {
  	List<Integer> list = new ArrayList<Integer>();
  	
  	if (root == null) return list;
  	
  	if (root.left != null)
  	  list.addAll(inOrderTraversal(root.left));
  	list.add(root.val);
  	
  	if (root.right != null)
  	  list.addAll(inOrderTraversal(root.right));
  	
  	return list;
  }
}