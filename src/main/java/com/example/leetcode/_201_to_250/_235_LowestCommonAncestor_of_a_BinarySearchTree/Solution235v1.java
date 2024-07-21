package com.example.leetcode._201_to_250._235_LowestCommonAncestor_of_a_BinarySearchTree;

import java.util.LinkedList;
import java.util.List;

import com.example.leetcode.utils.TreeNode;

/*
 * Your runtime beats 0.56% of java submissions.
 */

public class Solution235v1 implements Solution235
{
  public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q)
  {
    List<Integer> path1 = new LinkedList<Integer>();
    searchNode(root, p, path1);
    
    List<Integer> path2 = new LinkedList<Integer>(); 
    searchNode(root, q, path2);
    
    int i = path1.size() - 1;
    int j = path2.size() - 1;

    if (i > j) {
      while (i > j) i--;  
    }
    else if (i < j) {
      while (i < j) j--;
    }
    else {
      i--; j--;
    }
    
    int val = Integer.MAX_VALUE;
    do {
      val = path1.get(i--);
    } while (!path2.contains(val));
    
    return new TreeNode(val);
  }
  
  private boolean searchNode(TreeNode root, TreeNode target, List<Integer> path)
  {
    if (root == null) return false;

    path.add(new Integer(root.val));
    if (root.val == target.val) return true;
    
    if (searchNode(root.left, target, path)) return true;
    if (searchNode(root.right, target, path)) return true;
    
    path.remove(new Integer(root.val));
    
    return false;
  }
}
