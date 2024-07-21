package com.example.leetcode._101_to_150._112_PathSum;

import java.util.LinkedList;
import java.util.List;

import com.example.leetcode.utils.TreeNode;

/*
 * Your runtime beats 3.29 % of java submissions.
 */

public class Solution112v4 implements Solution112
{
  public boolean hasPathSum(TreeNode root, int sum) 
  {
    if (root == null) return false;

    List<TreeNode> list = new LinkedList<TreeNode>();
    list.add(root);
    
    List<Integer> sums = new LinkedList<Integer>();
    sums.add(0);
    
    while (!list.isEmpty())
    {
      for (int i=0; i<list.size(); i++)
      {
        TreeNode node = list.remove(0);
        Integer new_sum = sums.remove(0) + node.val;
        
        if (node.left == null && node.right == null) 
        {
          if  (new_sum == sum) return true;
        }
        else
        {
          if (node.right != null) 
          {
            sums.add(0, new_sum);  
            list.add(0, node.right);
          }
          
          if (node.left != null) 
          {
            sums.add(0, new_sum);  
            list.add(0, node.left);
          }
        }
      }
    }
    
    return false;
  }
}
