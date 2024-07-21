package com.example.leetcode._101_to_150._110_BalancedBinaryTree;

import java.util.Arrays;
import com.example.leetcode.utils.TreeNode;
import com.example.leetcode.utils.myTreeUtils;

public class Main110
{
  public static void main(String[] args)
  {
    System.out.println("110. Balanced Binary Tree");
    
    String format = "\r\nnums: %s"
                  + "\r\nIs balance? %b";

    Solution110 sol = new Solution110v1();

    for (Integer[] nums : _testCases)
    {
      TreeNode root = myTreeUtils.createBinaryTree(nums);
      boolean isBalance = sol.isBalanced(root);

      System.out.println(String.format(format, 
          Arrays.toString(nums), isBalance));
    }
  }

  private static Integer[][] _testCases = 
  {
      {}
    , {1,2,3,4,5,6,7}
    , {1,2,3,4,(Integer)null,(Integer)null,(Integer)null,8}
    , {1,2,2,3,null,null,3,4,null,null,4}
  };

}
