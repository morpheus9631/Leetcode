package com.example.leetcode._101_to_150._104_MaximumDepthOfBinaryTree;

import com.example.leetcode.utils.TreeNode;
import com.example.leetcode.utils.myTreeUtils;

public class Main104
{
  public static void main(String[] args)
  {
    System.out.println("104. Maximum Depth of Binary Tree");
    
    String format = "\r\nBT: %s"
                  + "\r\nThe maximum depth is %d" 
                  ;
    
    Solution104 sol = new Solution104v2();
    
    for (Integer[] nums : _testCases)
    {
      TreeNode root = myTreeUtils.createBinaryTree(nums);
      int max_depth = sol.maxDepth(root); 
      
      System.out.println(String.format(format, 
          myTreeUtils.toString(root), max_depth));
    }
  }
  
  private static Integer[][] _testCases = 
  {
      {}
    , {1,2,3,4,5,(Integer)null,(Integer)null} 
    , {1,2,3,4,(Integer)null,(Integer)null,5}
    , {1,2,3,(Integer)null,(Integer)null,4,5} 
  };
}
