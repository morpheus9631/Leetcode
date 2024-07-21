package com.example.leetcode._101_to_150._108_ConvertSortedArrayToBinarySearchTree;

import java.util.Arrays;
import com.example.leetcode.utils.TreeNode;
import com.example.leetcode.utils.myTreeUtils;

public class Main108
{
  public static void main(String[] args)
  {
    System.out.println("108. Convert Sorted Array to Binary Search Tree");
    
    String format = "\r\nnums: %s"
                  + "\r\nBST: %s" 
                  ;
    
    Solution108 sol = new Solution108v1();
    
    for (int[] nums : _testCases)
    {
      TreeNode root = sol.sortedArrayToBST(nums); 
      
      System.out.println(String.format(format, 
          Arrays.toString(nums), 
          myTreeUtils.toString(root)));
    }
  }
  
  private static int[][] _testCases = 
  {
      {}
    , {1,2,3,4,5,6,7}  
  };
}
