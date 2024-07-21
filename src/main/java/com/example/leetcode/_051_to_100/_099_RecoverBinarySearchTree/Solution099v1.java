package com.example.leetcode._051_to_100._099_RecoverBinarySearchTree;

import com.example.leetcode.utils.TreeNode;

public class Solution099v1 implements Solution099
{
  TreeNode preNode = null;
  TreeNode errorNode1 = null;
  TreeNode errorNode2 = null;
  
  public void recoverTree(TreeNode root) 
  {
    inorder(root);
    
    if ((errorNode1 != null) && (errorNode2 != null))
    {
      int tmp = errorNode1.val;
      errorNode1.val = errorNode2.val;
      errorNode2.val = tmp;
    }
  }
  
  public void inorder(TreeNode currNode)
  {
    if (currNode == null) return;
    
    inorder(currNode.left);
    
    if (preNode == null)
      preNode = currNode;
    else
    {
      if (preNode.val > currNode.val)
      {
        if (errorNode1 == null) errorNode1 = preNode;
        errorNode2 = currNode;
      }
      preNode = currNode;
    }
    
    inorder(currNode.right);
  }
}
