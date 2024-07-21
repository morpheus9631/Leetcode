package com.example.leetcode._101_to_150._109_ConvertSortedListToBinarySearchTree;

import java.util.Arrays;
import java.util.List;

import com.example.leetcode.utils.ListNode;
import com.example.leetcode.utils.TreeNode;
import com.example.leetcode.utils.myListUtils;
import com.example.leetcode.utils.myTreeUtils;

public class Main109
{
  public static void main(String[] args)
  {
    System.out.println("109. Convert Sorted List to Binary Search Tree");
    
    String format = "\r\nArray: %s"
                  + "\r\nRoot: %d"
                  + "\r\nInorder: %s";

    Solution109 sol = new Solution109v1();

    for (int[] nums : _testCases)
    {
      ListNode head = myListUtils.toList(nums);
      TreeNode root = sol.sortedListToBST(head);
      List<Integer> list = myTreeUtils.inorderTraversal(root);

      System.out.println(String.format(format, 
          Arrays.toString(nums), root.val, list.toString()));
    }
  }

  private static int[][] _testCases = 
  {
    { 1, 3 }, { 3, 5, 8 }
  };
}
