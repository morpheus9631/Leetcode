package com.example.leetcode._201_to_250._237_DeleteNodeIn_a_LinkedList;

import com.example.leetcode.utils.ListNode;

/*
 * Your runtime beats 9.76% of java submissions.
 */

public class Solution237v1 implements Solution237
{
  public void deleteNode(ListNode node) 
  {
    if (node == null) return;  
  
    node.val = node.next.val;  
    node.next = node.next.next;  
  }
}
