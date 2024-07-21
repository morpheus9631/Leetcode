package com.example.leetcode._101_to_150._101_SymmetricTree;

import com.example.leetcode.utils.TreeNode;
import com.example.leetcode.utils.myTreeUtils;

public class Main101
{
  public static void main(String[] args)
  {
    System.out.println("101. Symmetric Tree");
    
    String format = "\r\nBT: %s"
                  + "\r\nIs symmetric? %b" 
                  ;
    
    Solution101 sol = new Solution101v1();
    
    for (Integer[] nums : _testCases)
    {
      TreeNode root = myTreeUtils.createBinaryTree(nums);
      boolean isSymmetric = sol.isSymmetric(root);
      
      System.out.println(String.format(format, 
          myTreeUtils.toString(root), isSymmetric));
    }
  }
  
  private static Integer[][] _testCases = 
  {
      {1,2,2,3,4,4,3}
    , {1,2,2,(Integer)null,3,(Integer)null,3}
    , {9,-42,-42,null,76,76,null,null,13,null,13}
  };
}
