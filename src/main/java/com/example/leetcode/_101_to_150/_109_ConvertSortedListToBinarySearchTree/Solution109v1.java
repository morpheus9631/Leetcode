package com.example.leetcode._101_to_150._109_ConvertSortedListToBinarySearchTree;

import com.example.leetcode.utils.ListNode;
import com.example.leetcode.utils.TreeNode;

public class Solution109v1 implements Solution109
{
  ListNode curNode = null;
  
  public TreeNode sortedListToBST(ListNode head) 
  {
    if (head == null) return null;
    if (head.next == null) return new TreeNode(head.val);

    curNode = head;
    int len = getListLength(head);
    TreeNode root = createBinarySearchTree(len);

    return root;
  }
 
  private int getListLength(ListNode head)
  {
    int len = 0;
    
    ListNode point = head;
    while (point != null) { len++; point = point.next; }
    
    return len;
  }
  
  // using bottom-up method
  private TreeNode createBinarySearchTree(int len)
  {
    if (len <= 0) return null;
    
    TreeNode leftNode = createBinarySearchTree(len/2);
    
    TreeNode root = new TreeNode(curNode.val);
    root.left = leftNode;
    curNode = curNode.next;
    
    root.right = createBinarySearchTree(len-len/2-1);
    
    return root;
  }
}  
