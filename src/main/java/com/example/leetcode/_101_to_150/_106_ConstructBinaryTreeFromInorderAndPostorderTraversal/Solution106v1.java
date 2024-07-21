package com.example.leetcode._101_to_150._106_ConstructBinaryTreeFromInorderAndPostorderTraversal;

import com.example.leetcode.utils.TreeNode;

public class Solution106v1 implements Solution106 
{
  public TreeNode buildTree(int[] inorder, int[] postorder) 
  {
    int len = inorder.length;
    if(len <= 0) return null;
    
    return constructTree(inorder, 0, len-1, postorder, 0, len-1);
  }
  
  private TreeNode constructTree(int[] inorder, int iStart, int iEnd, 
      int[] postorder, int pStart, int pEnd)
  {
    if (iStart > iEnd) return null;
    
    TreeNode root = new TreeNode(postorder[pEnd]);

    int i = iStart;
    while (i < iEnd && inorder[i] != root.val) i++;
    
    int len_left = i - iStart;
    root.left = constructTree(inorder, iStart, i-1, postorder, pStart, pStart+len_left-1);
    root.right = constructTree(inorder, i+1, iEnd, postorder, pStart+len_left, pEnd-1);
    
    return root;
  }
}
