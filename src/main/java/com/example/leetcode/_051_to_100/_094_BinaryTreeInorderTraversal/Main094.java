package com.example.leetcode._051_to_100._094_BinaryTreeInorderTraversal;

import java.util.Arrays;
import java.util.List;

import com.example.leetcode.utils.TreeNode;
import com.example.leetcode.utils.myTreeUtils;

public class Main094
{
  public static void main(String[] args)
  {
    System.out.println("94. Binary Tree Inorder Traversal");
    
    String format = "\r\nBTree: %s"
                  + "\r\nInorder: %s"
                  ;
    
    Solution094 sol = new Solution094v1();
    
    for (Integer[] testcase : _testCases)
    {
      TreeNode root = myTreeUtils.createBinaryTree(testcase);
      List<Integer> res = sol.inorderTraversal(root);
      
      System.out.println(
          String.format(format,Arrays.toString(testcase), res.toString()));
    }
  }
  
  private static Integer[][] _testCases = 
  {
    { 0, 1, 2, 3, 4, 5, 6 },
    { 1, (Integer) null, 2, 3 } 
  };
  
}
