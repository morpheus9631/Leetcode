package com.example.leetcode._051_to_100._083_RemoveDuplicatesFromSortedList;

import com.example.leetcode.utils.ListNode;

/*
 * Your runtime beats 59.40 % of java submissions.
 */

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */

public class Solution083v1 implements Solution083
{
  public ListNode deleteDuplicates(ListNode head) 
  { 
    if (head == null) return null;
    
    ListNode preNode = head;
    ListNode curNode = head;

    while (curNode.next != null)
    {
      curNode = curNode.next;
      if (preNode.val == curNode.val) 
        preNode.next = curNode.next;
      else
        preNode = curNode;
    }
    return head;
  }
}