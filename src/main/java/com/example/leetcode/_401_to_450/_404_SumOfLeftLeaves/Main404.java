package com.example.leetcode._401_to_450._404_SumOfLeftLeaves;

import com.example.leetcode.utils.TreeNode;
import com.example.leetcode.utils.myTreeUtils;

public class Main404
{
  public static void main(String[] args)
  {
    System.out.println("404. Sum of Left Leaves");
    
    String format = "\r\nBST = %s"
                  + "\r\nThe sum of all left leaves is %d"
                  ;
    
    Solution404 sol = new Solution404v5();
    
    for (Integer[] nums : _testCases)
    {
      TreeNode root = myTreeUtils.createBinaryTree(nums);
      int res = sol.sumOfLeftLeaves(root);
      
      System.out.println(String.format(format, 
          myTreeUtils.toString(root), res));
    }
  }
  
  private static Integer[][] _testCases = 
  {
      { 3, 9, 20, null, null, 15, 7 }     // excepted: 24
    , { 1,2,3,4,5 }                       // excepted: 4  
  };
}
