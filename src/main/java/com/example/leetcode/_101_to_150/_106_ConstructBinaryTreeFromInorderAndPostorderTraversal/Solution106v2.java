package com.example.leetcode._101_to_150._106_ConstructBinaryTreeFromInorderAndPostorderTraversal;

import java.util.Arrays;
import com.example.leetcode.utils.TreeNode;

public class Solution106v2 implements Solution106 
{
  public TreeNode buildTree(int[] inorder, int[] postorder) 
  {
    int len = inorder.length;
    if (len <= 0) return null;
    
    TreeNode root = new TreeNode(postorder[len-1]);

    int i = 0;
    while (i < len && inorder[i] != root.val) i++;

    int[] leftInOrder  = Arrays.copyOfRange(inorder, 0, i);
    int[] rightInOrder = Arrays.copyOfRange(inorder, i+1, len);

    int[] leftPostOrder  = Arrays.copyOfRange(postorder, 0, i);
    int[] rightPostOrder = Arrays.copyOfRange(postorder, i, len-1);

    root.left = buildTree(leftInOrder,leftPostOrder);
    root.right = buildTree(rightInOrder,rightPostOrder);

    return root;
  }
  
  
}
