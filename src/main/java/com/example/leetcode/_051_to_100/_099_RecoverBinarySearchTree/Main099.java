package com.example.leetcode._051_to_100._099_RecoverBinarySearchTree;

import java.util.List;

import com.example.leetcode.utils.TreeNode;
import com.example.leetcode.utils.myTreeUtils;

public class Main099
{
  public static void main(String[] args)
  {
    System.out.println("99. Recover Binary Search Tree");
    
    String format = "\r\nMistake: %s"
                  + "\r\nCorrect: %s";
    
    Solution099 sol = new Solution099v1();
    
    for (Integer[] testcase : _testCases)
    {
      TreeNode root = myTreeUtils.createBinaryTree(testcase);
      List<Integer> misOrder = myTreeUtils.inorderTraversal(root);
      String misStr = misOrder.toString();
      
      sol.recoverTree(root);
      List<Integer> corOrder = myTreeUtils.inorderTraversal(root);
      String corStr = corOrder.toString();
      
      System.out.println(String.format(format, misStr, corStr));
    }
  }
  
  /*
   * Test case 1: [0, 1]
   *  
   *      0
   *     /
   *    1
   * 
   * Expected: [1, 0]
   * 
   * Test case 2: [3, null, 2, null, 1]
   * 
   *       3
   *        \
   *         2
   *          \
   *           1
   *     
   *  Expected: [1, null, 2, null, 3]
   *       
   */
  
  private static Integer[][] _testCases =
  {
    { 0, 1, (Integer)null }, 
    { 3, (Integer)null, 2, (Integer)null, 1 },
    { 0,
      1,2,
      3,4,(Integer)null,5,
      6,7,(Integer)null,(Integer)null,8,9} 
  };
}
