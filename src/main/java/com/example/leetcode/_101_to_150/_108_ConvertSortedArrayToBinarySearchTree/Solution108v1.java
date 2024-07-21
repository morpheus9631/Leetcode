package com.example.leetcode._101_to_150._108_ConvertSortedArrayToBinarySearchTree;

import com.example.leetcode.utils.TreeNode;

/*
 * Your runtime beats 15.00% of java submissions.
 */

public class Solution108v1 implements Solution108 
{
  public TreeNode sortedArrayToBST(int[] nums)
  {
    if (nums == null || nums.length == 0) return null;
    
    return buildBST(nums, 0, nums.length-1);
  }
  
  private TreeNode buildBST(int[] nums, int left, int right)
  {
    if (left > right) return null;
    
    int mid = (left + right) / 2;
    
    TreeNode root = new TreeNode(nums[mid]);
    root.left = buildBST(nums, left, mid-1);
    root.right = buildBST(nums, mid+1, right);
    return root;
  }
}
