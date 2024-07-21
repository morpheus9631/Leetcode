package com.example.leetcode._251_to_300._257_BinaryTreePaths;

import java.util.Arrays;
import java.util.List;

import com.example.leetcode.utils.TreeNode;
import com.example.leetcode.utils.myTreeUtils;

public class Main257
{
  public static void main(String[] args)
  {
    System.out.println("257. Binary Tree Paths");
    
    String format = "\r\nS = %s"
                  + "\r\nAll paths are %s"
                  ;
        
    Solution257 sol = new Solution257v1();

    for (Integer[] nums : _testCases)
    {
      TreeNode root = myTreeUtils.createBinaryTree(nums);
      List<String> allPath = sol.binaryTreePaths(root);

      System.out.println(
          String.format(format, Arrays.toString(nums), allPath.toString())); 
    }
  }

  private static Integer[][] _testCases = 
  {
      {1,2,3,null,5}
    , {}    
  };
}
