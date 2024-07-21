package com.example.leetcode._101_to_150._111_MinimumDepthOfBinaryTree;

import java.util.Arrays;

import com.example.leetcode.utils.TreeNode;
import com.example.leetcode.utils.myTreeUtils;

public class Main111
{
  public static void main(String[] args)
  {
    System.out.println("111. Minimum Depth of Binary Tree");
    
    String format = "\r\nnums: %s"
                  + "\r\nMinimum depth: %d";

    Solution111 sol = new Solution111v2();

    for (Integer[] nums : _testCases)
    {
      TreeNode root = myTreeUtils.createBinaryTree(nums);
      int depth = sol.minDepth(root);

      System.out.println(String.format(format, 
          Arrays.toString(nums), depth));
    }
  }

  private static Integer[][] _testCases = 
  {
      {}
    , {1,2}                                    // Expected: 2 
    , {1,2,3}                                  // Expected: 2
    , {1,2,3,4,5}                              // Expected: 2
    , {1,2,3,4,(Integer)null,(Integer)null,5}  // Expected: 3
  };
}
