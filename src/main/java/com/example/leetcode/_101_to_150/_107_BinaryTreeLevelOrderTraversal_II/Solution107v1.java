package com.example.leetcode._101_to_150._107_BinaryTreeLevelOrderTraversal_II;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import com.example.leetcode.utils.TreeNode;

/*
 * Your runtime beats 25.35% of java submissions.
 */

public class Solution107v1 implements Solution107
{
  public List<List<Integer>> levelOrderBottom(TreeNode root) 
  {
    List<List<Integer>> listList = new ArrayList<List<Integer>>();
    if (root == null) return listList;
    
    List<TreeNode> nodeList = new LinkedList<TreeNode>();
    nodeList.add(root);

    while (!nodeList.isEmpty())
    {
      List<Integer> valList = new LinkedList<Integer>();  
      
      int size = nodeList.size();
      for (int i=0; i<size; i++)
      {
        TreeNode node = nodeList.remove(0);
        
        if (node != null)
        {
          valList.add(node.val);
          if (node.left != null) nodeList.add(node.left); 
          if (node.right != null) nodeList.add(node.right); 
        }
      }

      listList.add(0, valList);
    }
    
    return listList;
  }
}
