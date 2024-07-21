package com.example.leetcode._201_to_250._226_InvertBinaryTree;

import com.example.leetcode.utils.TreeNode;
import com.example.leetcode.utils.myTreeUtils;

public class Main226
{
  public static void main(String[] args)
  {
    System.out.println("226. Invert Binary Tree");

    String format = "\r\nBinary tree = %s"
                  + "\r\nInvert tree is %s"
                  ;
    
    Solution226 sol = new Solution226v3();

    for (Integer[] nums : _testCases)
    {
      TreeNode root = myTreeUtils.createBinaryTree(nums);
      String treeStr = myTreeUtils.toString(root);
      
      root = sol.invertTree(root);
      String invertStr = myTreeUtils.toString(root);
      
      System.out.println(String.format(format, treeStr, invertStr));
    }
  }
  
  private static Integer[][] _testCases = 
  {
    { 4, 2, 7, 1, 3, 6, 9 }  
  };
}
