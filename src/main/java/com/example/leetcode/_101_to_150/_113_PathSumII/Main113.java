package com.example.leetcode._101_to_150._113_PathSumII;

import java.util.List;
import com.example.leetcode.utils.TreeNode;
import com.example.leetcode.utils.myListUtils;
import com.example.leetcode.utils.myTreeUtils;

/*
 * 2016.10.04: 
 *   
 *     preOrder = [5, 4, 11, 7, 2, 8, 13, 4, 5, 1]
 *      inOrder = [7, 11, 2, 4, 5, 13, 8, 5, 4, 1]
 *    postOrder = [7, 2, 11, 4, 13, 5, 1, 4, 8, 5]
 *     
 */

public class Main113
{
  public static void main(String[] args)
  {
    System.out.println("113. Path Sum II");
    
    String replaceStr = "###";
    String format = "\r\nTree (inorder):\r\n %s"
                  + "\r\n\r\nSum: %d"
                  + "\r\n\r\nReturn:\r\n" + replaceStr
                  ;
    
    Solution113 sol = new Solution113v1();
    
    for (Integer[][] testcase : _testCases)
    {
      Integer[] nums = testcase[0];
      int sum = testcase[1][0];
      
      TreeNode root = myTreeUtils.createBinaryTree(nums);
      List<Integer> inorder = myTreeUtils.inorderTraversal(root);
      List<List<Integer>> res = sol.pathSum(root, sum);
      
      String str = myListUtils.toString(res);
      String outstr = String.format(format, inorder.toString(), sum)
                      .replace(replaceStr, str);
      System.out.println(outstr); 
    }
  }

  private static Integer[][][] _testCases = 
  {
    { 
      { 5, 4, 8, 11, (Integer)null, 13, 4, 7, 2, (Integer)null, (Integer)null, 5, 1},
      { 22 }
    }  
  };
  
}
