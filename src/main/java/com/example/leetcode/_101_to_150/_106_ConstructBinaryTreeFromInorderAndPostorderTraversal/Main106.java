package com.example.leetcode._101_to_150._106_ConstructBinaryTreeFromInorderAndPostorderTraversal;

import java.util.Arrays;
import java.util.List;

import com.example.leetcode.utils.TreeNode;
import com.example.leetcode.utils.myTreeUtils;

public class Main106
{
  public static void main(String[] args)
  {
    System.out.println("106. Construct Binary Tree from Inorder and Postorder Traversal");
    
    String format = "\r\nInorder: %s"
                  + "\r\nPostOrder: %s"
                  + "\r\n\r\nInorder: %s"
                  ;
    
    Solution106 sol = new Solution106v1();
    
    for (int[][] testcase : _testCases)
    {
      int[] inOrder = testcase[0];
      int[] postOrder = testcase[1];
      
      TreeNode root = sol.buildTree(inOrder, postOrder);

      List<Integer> list = myTreeUtils.inorderTraversal(root);
      System.out.println(String.format(format, 
           Arrays.toString(inOrder), Arrays.toString(postOrder), 
           list.toString()));
    }
  }
  
  private static int[][][] _testCases = 
  {
    // preorder: { 0,1,3,6,7,4,2,5,8,9 };
    { {6,3,7,1,4,0,2,8,5,9}, {6,3,7,1,4,0,2,8,5,9} } 
  };
}
