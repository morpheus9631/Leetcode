package com.example.leetcode._101_to_150._107_BinaryTreeLevelOrderTraversal_II;

import java.util.List;

import com.example.leetcode.utils.TreeNode;
import com.example.leetcode.utils.myListUtils;
import com.example.leetcode.utils.myTreeUtils;

public class Main107
{
  public static void main(String[] args)
  {
    System.out.println("107. Binary Tree Level Order Traversal II");
    
    String format = "\r\nBT: %s"
                  + "\r\nReturn:\r\n%s" 
                  ;
    
    Solution107 sol = new Solution107v1();
    
    for (Integer[] nums : _testCases)
    {
      TreeNode root = myTreeUtils.createBinaryTree(nums);
      List<List<Integer>> listList = sol.levelOrderBottom(root); 
      
      System.out.println(String.format(format, 
          myTreeUtils.toString(root), myListUtils.toString(listList)));
    }
  }
  
  private static Integer[][] _testCases = 
  {
      {}
    , {3,9,20,null,null,15,7}   
  };
}
