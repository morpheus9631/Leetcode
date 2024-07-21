package com.example.leetcode._151_to_200._199_BinaryTreeRightSideView;

import java.util.Arrays;
import java.util.List;

import com.example.leetcode.utils.TreeNode;
import com.example.leetcode.utils.myStringUtils;
import com.example.leetcode.utils.myTreeUtils;

public class Main199
{
  public static void main(String[] args)
  {
    System.out.println("199. Binary Tree Right Side View ");

    String format = "\r\nTree = %s"
                  + "\r\nReturn: %s"
                  + "\r\n\r\n" + myStringUtils.dashLine();
    
    Solution199 sol = new Solution199v3();
    
    for (Integer[] nums : _testCases)
    {
      TreeNode root = myTreeUtils.createBinaryTree(nums);
      List<Integer> res = sol.rightSideView(root);
      
      System.out.println(
          String.format(format, Arrays.toString(nums), res.toString()));
    }
  }
  
  private static Integer[][] _testCases = 
  {
      {1, 2, 3, null, 5, null, 4}
    , { 1, 2 }
  };
}
